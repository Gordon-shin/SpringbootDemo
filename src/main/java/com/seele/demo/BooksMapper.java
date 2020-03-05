package com.seele.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
//@Mapper
//@Component(value = "BooksMapper")
@Mapper
@Repository(value = "BooksMapper")
public interface BooksMapper {
    @Select("select * from book;") //将
    @Results({
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "author",property = "author"),
    }
    )
    List<books> getBooks();


    @Select("select name from book where id ='-1';") //将
    @Results({
            @Result(column = "name",property = "name"),
    })
    List<books> getName();

    @Select("select * from book where id = #{id};")
    List<books> getBookById(String id);
}
