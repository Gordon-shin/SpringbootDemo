package com.seele.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "BookService")
public class BookService {

    @Autowired
    BooksMapper booksMapper;

    public List<books> getAllBooks(){
        List<books>res =null;
        try{
            res = booksMapper.getBooks();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return res;
    }
    public List<books> getNames(){
        List<books>res =null;
        try{
            res = booksMapper.getName();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return res;
    }
    public List<books> getBookById(String id){
        List<books>res =null;
        try{
            res = booksMapper.getBookById(id);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return res;
    }
}
