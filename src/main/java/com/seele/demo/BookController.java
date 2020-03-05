package com.seele.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.SQLOutput;
import java.util.List;

@Controller
public class BookController {
    @Resource(name = "BookService")
    BookService bookService;

    @RequestMapping(value = "/books",method = RequestMethod.GET )
    @ResponseBody
    public List<books> getBooksJson(){
        return bookService.getAllBooks();
    }
    @RequestMapping(value = "/books/names",method = RequestMethod.GET )
    @ResponseBody
    public List<books> getNames(){
        return bookService.getNames();
    }
    @RequestMapping(value = "/books/namesbyid/{id}/{name}",method = RequestMethod.GET )
    @ResponseBody
    public List<books> getBooksById(@PathVariable String id,@PathVariable String name){
        System.out.println(name);
        return bookService.getBookById(id);
    }
}
