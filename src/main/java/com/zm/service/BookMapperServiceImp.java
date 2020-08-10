package com.zm.service;

import com.zm.dao.Mapper;
import com.zm.pojo.Books;

import java.util.List;

public class BookMapperServiceImp implements BookMapperService{
    private Mapper bookMapper;

    public void setBookMapper(Mapper bookMapper){
        this.bookMapper=bookMapper;
    }
    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public List<Books> queryBookName(String queryName){return bookMapper.queryBookName(queryName);};

}
