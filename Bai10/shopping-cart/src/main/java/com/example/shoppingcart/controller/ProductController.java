package com.example.shoppingcart.controller;

import com.example.shoppingcart.entity.Cart;
import com.example.shoppingcart.entity.Product;
import com.example.shoppingcart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/product")
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    ProductService productService;

    @ModelAttribute("cart")
    public Cart init() {
        return new Cart();
    }

    @GetMapping("list")
    public String viewShop(Model model) {
        model.addAttribute("products", productService.findAll());
        return "/list";
    }

    @GetMapping("/detail/{id}")
    public String viewDetail(Model model, @PathVariable int id) {
        Optional<Product> productOptional = productService.findById(id);
        if (productOptional.isPresent()) {
            model.addAttribute("product", productOptional.get());
        }
        return "/detail";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id, @SessionAttribute("cart") Cart cart){
        Optional<Product> productOptional = productService.findById(id);
        if (productOptional.isPresent()){
            cart.deleteProduct(productOptional.get());
        }
        return "redirect:/cart/list";
    }
    @GetMapping("/change")
    public String changeQuantity(@SessionAttribute("cart") Cart cart, Model model, @RequestParam("id") int id, @RequestParam("newQuantity") int newQuantity) {
        Optional<Product> productOptional = productService.findById(id);
        if (productOptional.isPresent()) {
            cart.changeQuantity(productOptional.get(), newQuantity);
            model.addAttribute("product", productOptional.get());
        }
        return "redirect:/cart/list";
    }

    @GetMapping("/add/{id}")
    public String addProduct(@PathVariable int id, @SessionAttribute("cart") Cart cart) {
        Optional<Product> productOptional = productService.findById(id);
        if (productOptional.isPresent()) {
            cart.addProduct(productOptional.get());
        }
        return "redirect:/cart/list";
    }
}
