package codegym.vn.controller;

import codegym.vn.entity.Student;
import codegym.vn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;
    // constructor injection
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

//    @GetMapping("/student/list")
    @RequestMapping(value = "/list", method = RequestMethod.GET
//        , consumes = {"text/html"}
    )
    public String displayList(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "student/list";
    }

    @GetMapping("/detail/{id}")
    public String displayDetail(Model model, @PathVariable("id") String id) {
        Student student = studentService.findById(id);
        model.addAttribute("student", student);
        return "student/detail";
    }

    @GetMapping("/detail")
    public String displayDetail2(Model model, @RequestParam("id") String id) {
        Student student = studentService.findById(id);
        model.addAttribute("student", student);
        return "student/detail";
    }

    @GetMapping("/detail2")
    public String displayDetail3(Model model, @RequestParam("id") String id, RedirectAttributes attributes) {
        model.addAttribute("message", "From list page");
        attributes.addFlashAttribute("message1", "From list page");;
        return "redirect:/student/detail?id=" + id;
    }
    // setter injection
//    @Autowired
//    public void setStudentService(StudentService studentService) {
//        this.studentService = studentService;
//    }
}
