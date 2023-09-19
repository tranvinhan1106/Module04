package com.example.shoppingcart.controller;

import com.example.shoppingcart.entity.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@RequestMapping("/cart")
public class CartController {
    @GetMapping("/list")
    public String showList(Model model, @SessionAttribute(value = "cart", required = false) Cart cart){
        model.addAttribute("cart", cart);
        return  "/listCart";
    }
}
