package com.demo.dao;

import com.demo.entity.Book;

public interface BookDao
{
    public String findBookById(int id);
    
    public void saveBook(Book book);
}