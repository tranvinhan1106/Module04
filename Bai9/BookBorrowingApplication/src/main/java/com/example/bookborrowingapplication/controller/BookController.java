package com.example.bookborrowingapplication.controller;

import com.example.bookborrowingapplication.entity.Book;
import com.example.bookborrowingapplication.entity.Borrow;
import com.example.bookborrowingapplication.service.BookService;
import com.example.bookborrowingapplication.service.BorrowService;
import com.example.bookborrowingapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private BorrowService borrowService;
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String viewListPaging(Model model, @RequestParam("page") Optional<Integer> page, @RequestParam("size") Optional<Integer> size) {
        int currentPage = page.orElse(1);
        int currentSize = size.orElse(3);
        Pageable pageable = PageRequest.of(currentPage - 1, currentSize);
        Page<Book> books = bookService.findAll(pageable);
        model.addAttribute("books", books);
        int totalPage = books.getTotalPages();
        if (totalPage > 1) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPage)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "book/list";
    }

    @GetMapping("/detail")
    public String view(@RequestParam("idBook") long idBook, Model model) {
        Borrow borrow = new Borrow();
        borrow.setIdBorrow(random());
        model.addAttribute("borrow", borrow);
        model.addAttribute("book", bookService.findById(idBook));
        return "book/detail";
    }

    @PostMapping("/borrow")
    public String doBorrow(@ModelAttribute("borrow") Borrow borrow, @RequestParam("bookID") long id) {
        borrowService.borrowBook(borrow.getUser().getIdUser(), id, borrow.getIdBorrow());
        return "redirect:/book/list";
    }

    @GetMapping("/back")
    public String viewBack(Model model, @RequestParam("idBook") long id) {
        model.addAttribute("borrow", new Borrow());
        model.addAttribute("book", bookService.findById(id));
        return "book/return";
    }

    @PostMapping("/return")
    public String doReturn(@ModelAttribute("borrowId") Borrow borrow, @RequestParam("bookId") long id) {
        borrowService.returnBook(borrow.getUser().getIdUser(), id, borrow.getIdBorrow());
        return "redirect:/book/list";
    }

    private int random() {
        int code;
        while (true) {
            code = (int) Math.floor(((Math.random() * 89999) + 10000));
            if (userService.findById(code) == null) {
                return code;
            }
        }
    }
}
