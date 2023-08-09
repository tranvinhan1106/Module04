package codegym.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/list")
    public String showList(){
        return "list";
    }
    @PostMapping("/calculator")
    public String doCalculator(@RequestParam int a , @RequestParam int b , @RequestParam String submit , Model model){
        int result;
        switch (submit)
        {
            case "+":
                result=a + b;
                break;
            case "-":
                result=a-b;
                break;
            case "*":
                result=a*b;
                break;
            default:
                result=a/b;
        }
        model.addAttribute("result" , result);
        return "result";
    }
}
