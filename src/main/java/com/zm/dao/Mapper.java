package com.zm.dao;

import com.zm.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Mapper {
    //增加一个Book
    int addBook(Books book);
    //根据id删除一个Book
    int deleteBookById(@Param("bookID") int id);
    //更新Book
    int updateBook(Books books);
    //根据id查询,返回一个Book
    Books queryBookById(@Param("bookID") int id);
    //查询全部Book,返回list集合
    List<Books> queryAllBook();
    //根据名字查询Book,返回list集合
    List<Books> queryBookName(@Param("bookName") String bookName);
}
