package codegym.vn.controller;

import codegym.vn.entity.Blog;
import codegym.vn.service.BlogService;
import codegym.vn.service.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private BlogServiceImpl blogService ;
    @GetMapping("/list")
    public String showList(Model model){
        model.addAttribute("blogs",blogService.findAll());
        return "blog/list";
    }
    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("blogs",new Blog());
        return "blog/create";
    }
    @PostMapping("/save")
    public String doCreate(@ModelAttribute("blogs") Blog blog){
        blogService.create(blog);
        return "redirect:/blog/list";
    }
    @GetMapping("/view")
    public String view(@RequestParam("id") String id , Model model) {
        model.addAttribute("blogs", blogService.findById(id));
        return "blog/detail";
    }
    @GetMapping("/edit")
    public String showEdit(Model model, @RequestParam("id") String id) {
        model.addAttribute("blog", blogService.findById(id));
        return "blog/edit";
    }
    @PostMapping("/edit")
    public String doEdit(Blog blog){
        blogService.update(blog);
        return "redirect:/blog/list";
    }
    @GetMapping("/delete")
    public String doDelete (@RequestParam("id") String id){
        blogService.deleteById(id);
        return "redirect:/blog/list";
    }

}
