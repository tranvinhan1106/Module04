package codegym.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyController {
    public double converter(double usd,double rate) {
        return usd * rate;
    }
    @GetMapping("/currency")
    public String calculate(){
        return "view";
    }
    @PostMapping("/calculate")
    public String doCalculate(@RequestParam double usd , @RequestParam double rate , Model model){
        model.addAttribute("result" , converter(usd,rate));
        return "result";
    }

}
