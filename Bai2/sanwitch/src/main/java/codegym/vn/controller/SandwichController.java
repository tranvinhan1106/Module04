package codegym.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {

    @GetMapping("/index")
    public String showConvert() {
        return "index";
    }

    @PostMapping("/result")
    public String  saveChanges(@RequestParam String[] condiment, Model model){
        String result = " ";
        for (String s:condiment) {
            result +=s;
        }
        model.addAttribute("result",result);
        return  "result";
    }
}
