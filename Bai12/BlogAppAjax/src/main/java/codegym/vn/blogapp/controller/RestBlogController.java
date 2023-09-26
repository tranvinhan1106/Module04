package codegym.vn.blogapp.controller;

import codegym.vn.blogapp.entity.Blog;
import codegym.vn.blogapp.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/api/blog")
public class RestBlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/search")
    public ResponseEntity<List<Blog>> searchByName(@RequestParam("name") String name) {
        return new ResponseEntity<>(blogService.searchByName(name), HttpStatus.OK);
    }


    @GetMapping("/listPaging")
    public ResponseEntity<List<Blog>> getBlogListPaging(@RequestParam(defaultValue = "0") int page,
                                                        @RequestParam(defaultValue = "5") int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("id").descending());
        Page<Blog> blogPage = blogService.findAll(pageable);
        List<Blog> blogList = blogPage.getContent();
        return ResponseEntity.ok(blogList);
    }
}