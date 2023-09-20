package com.example.restfulblog.controller;

import com.example.restfulblog.entity.Blog;
import com.example.restfulblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/blog")
public class RestBlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping
    public ResponseEntity<List<Blog>> findAllBlog() {
        List<Blog> blogs = blogService.findAll();
        if (blogs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }
    @GetMapping("{id}")
    public ResponseEntity<Blog> findBlogById(@PathVariable String id) {
        Optional<Blog> blogOptional = blogService.findById(id);
        if(!blogOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogOptional.get(),HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Blog> saveBlog(@RequestBody Blog blog){
        blogService.create(blog);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Blog> deleteCustomer(@PathVariable String id ){
        Optional<Blog> customerOptional = blogService.findById(id);
        if (!customerOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blogService.delete(id);
        return new ResponseEntity<>(customerOptional.get(),HttpStatus.NO_CONTENT);
    }

}
