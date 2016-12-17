package com.demo.service;

import com.demo.entity.Book;

public interface BookService {
	public String findBookById(int id);
    public void saveBook(Book book);
}
