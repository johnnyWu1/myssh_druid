package com.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.BookDao;
import com.demo.entity.Book;
import com.demo.service.BookService;

@Service
public class BookServiceImpl implements BookService
{
    @Autowired
    private BookDao bookDao;
    public String findBookById(int id)
    {
        return bookDao.findBookById(id);
    }
    public void saveBook(Book book)
    {
        bookDao.saveBook(book);
        
    }
}