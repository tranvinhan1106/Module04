package com.example.validate.controller;

import com.example.validate.entity.User;
import com.example.validate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/list")
    public String showList(Model model){
        model.addAttribute("users",userService.findAll());
        return "user/list";
    }
    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("users",new User());
        return "user/create";
    }
    @PostMapping("/create")
    public String doCreate(@Validated  @ModelAttribute("users") User user, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "user/create";
        }
        userService.create(user);
        return "redirect:/user/list";
    }
}
