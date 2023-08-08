package codegym.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TranslateController {
    @GetMapping("/Translate")
    public String showViewTranslate(){
        return "view";
    }
    @PostMapping("/handle")
    public String doTranslate(@RequestParam String text , Model model){
        model.addAttribute("result" , translates(text));
        return "result";
    }
    public String translates(String text){
        String english[] = {"Dog" , "Chicken" , "Cat" , "Fish"};
        String vietnamese[] = {"Chó" , "Gà" , "Mèo" , "Cá"};
        for (int i = 0; i < vietnamese.length; i++) {
            if (text.equals(vietnamese[i])){
                return english[i];
            }
        }
        return "Not available";
    }

}
