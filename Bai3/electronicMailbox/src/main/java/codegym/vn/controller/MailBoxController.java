package codegym.vn.controller;

import codegym.vn.entity.Mail;
import codegym.vn.service.MailBoxServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("mail")
public class MailBoxController {
    MailBoxServiceImpl mailBoxService = new MailBoxServiceImpl();

    @RequestMapping(value = "/list", method = RequestMethod.GET
//        , consumes = {"text/html"}
    )
    public String showList(Model model) {
        model.addAttribute("Mail", mailBoxService.findAll());
        return "mail/list";
    }

    @GetMapping("/update")
    public String showViewEdit(Model model, @RequestParam("id") String id) {
        model.addAttribute("language", getLanguage());
        model.addAttribute("pageSize", getPageSize());
        model.addAttribute("mail", mailBoxService.findById(id));
        return "mail/update";
    }

    @PostMapping("/update")
    public String doCreateOrEdit(@ModelAttribute("mail") Mail mail) {
        mailBoxService.update(mail);
        return "redirect:/mail/list";
    }

    public List<String> getLanguage() {
        List<String> languages = new ArrayList<>();
        languages.add("Vietnamese");
        languages.add("English");
        languages.add("Japanese");
        languages.add("Chinese");
        return languages;
    }

    public List<String> getPageSize() {
        List<String> pageSizes = new ArrayList<>();
        pageSizes.add("5");
        pageSizes.add("10");
        pageSizes.add("15");
        pageSizes.add("25");
        pageSizes.add("50");
        pageSizes.add("100");
        return pageSizes;
    }
}
