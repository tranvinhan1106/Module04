package codegym.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TranslateController {
    public String translates(String text){
        String english[] = {"Dog","Chicken","Cat","Fish"};
        String vietnamese[] = {"Chó","Gà","Mèo","Cá"};
        for (int i = 0; i < english.length; i++) {
            if (text.equals(english[i])){
                return vietnamese[i];
            }
        }
        return "Not available";
    }
    @GetMapping("/translate")
    public String showViewTranslate(){
        return "view";
    }
    @PostMapping("/handle")
    public String doTranslate(@RequestParam String text , Model model){
        model.addAttribute("result" , translates(text));
        return "result";
    }


}
