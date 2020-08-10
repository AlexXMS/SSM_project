package com.zm.controller;

import com.zm.pojo.Books;
import com.zm.service.BookMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImp")
    private BookMapperService bookMapperService;

    @RequestMapping("/allbook")
    public String list(Model model){
        List<Books> list = bookMapperService.queryAllBook();
        model.addAttribute("list", list);
        return "allbook";
    }

    //=========================================================
    @RequestMapping("/toAddBook")
    public String toAddPaper() {
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addPaper(Books books) {
        //System.out.println(books);
        bookMapperService.addBook(books);
        return "redirect:/book/allbook";
    }

    //=========================================================
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model, int id) {
        Books book_update = bookMapperService.queryBookById(id);
        model.addAttribute("book_update",book_update);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updatePaper(Model model, Books books) {
        System.out.println(books);
        bookMapperService.updateBook(books);
        Books book_new = bookMapperService.queryBookById(books.getBookID());
        model.addAttribute("book", book_new);
        return "redirect:/book/allbook";
    }

    //=========================================================
    @RequestMapping("/deleteBook/{bookId}")
    public String deletePaper(@PathVariable("bookId") int id) {
        bookMapperService.deleteBookById(id);
        return "redirect:/book/allbook";
    }

    //=========================================================
    @RequestMapping("/queryBook")
    public String queryBookName(Model model, String queryBookName) {
        System.out.println("the book name ==>"+queryBookName);
        List<Books> list = bookMapperService.queryBookName(queryBookName);
        System.out.println("the books==>"+list);
        model.addAttribute("list", list);
        return "allbook";
    }
}
