package codegym.vn.blogapp.controller;

import codegym.vn.blogapp.entity.Blog;
import codegym.vn.blogapp.service.BlogService;
import codegym.vn.blogapp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/blog")
public class BlogAppController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;
//    @GetMapping("/list")
//    private String showList(Model model){
//        model.addAttribute("blogs",blogService.findAll());
//        return "blog/list";
//    }
    @GetMapping("/list")
    public String viewListPaging(Model model,
                                 @RequestParam("page") Optional<Integer> page,
                                 @RequestParam("size")Optional<Integer>size)
    {
        int currentPage=page.orElse(1);
        int currentSize=size.orElse(3);
        Pageable pageable= PageRequest.of(currentPage-1,currentSize);
        Page<Blog> blogs=blogService.findAll(pageable);
        model.addAttribute("blog",blogs);
        int totalPage = blogs.getTotalPages();
        if (totalPage > 1) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPage)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "/blog/list";
    }
    @GetMapping("/create")
    public String showFormList(Model model){
        model.addAttribute("blogs" , new Blog());
        model.addAttribute("category" , categoryService.findAll());
        return "blog/create";
    }
    @PostMapping("/create")
    public String doCreate(@ModelAttribute("blogs") Blog blog){
        blogService.create(blog);
        return "redirect:/blog/list";
    }
    @GetMapping("/delete")
    public String doDelete(@RequestParam("id") String id) {
        blogService.delete(id);
        return "redirect:/blog/list";
    }
    @GetMapping("/edit")
    public String viewEdit(Model model , @RequestParam("id") String id)
    {
        model.addAttribute("blog", blogService.findById(id));
        model.addAttribute("categorys",categoryService.findAll());
        return "blog/edit";
    }
    @PostMapping("/edit")
    public String doEdit(@ModelAttribute("blog") Blog blog)
    {
        blogService.update(blog);
        return "redirect:/blog/list";
    }
    @PostMapping("/search")
    public String doSearch(Model model,@RequestParam("search") String id) {
        model.addAttribute("blogs",blogService.findById(id));
        return "blog/detail";
    }
    @GetMapping("/detail")
    public String view(@RequestParam("id") String id , Model model) {
        model.addAttribute("blogs", blogService.findById(id));
        return "blog/detail";
    }
}

