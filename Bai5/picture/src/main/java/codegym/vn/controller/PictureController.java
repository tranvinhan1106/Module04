package codegym.vn.controller;

import codegym.vn.entity.Picture;
import codegym.vn.service.PictureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/picture")
public class PictureController {
    private PictureServiceImpl picture ;
    @Autowired
    public PictureController(PictureServiceImpl picture) {
        this.picture = picture;
    }

    @GetMapping("/list")
    public String showList(Model model){
        model.addAttribute("picture",picture.findAll());
        return "picture/view";
    }
    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("picture" ,new Picture());
        return "picture/create";
    }
    @PostMapping("/save")
    public String doCreate(@ModelAttribute("picture") Picture picture1){
        picture.create(picture1);
        return "redirect:/picture/list";
    }

}
