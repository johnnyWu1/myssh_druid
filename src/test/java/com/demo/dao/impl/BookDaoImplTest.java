package com.demo.dao.impl;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.entity.Book;
import com.demo.service.BookService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/application-config.xml")
public class BookDaoImplTest extends AbstractJUnit4SpringContextTests {
	
	@Autowired
    private BookService bookService;
    
    
    @Test
    public void test()
    {	
        DataSource dataSource=(DataSource) this.applicationContext.getBean(DataSource.class);
        System.out.println(dataSource);
    }
    @Test
    public void test2()
    {
        String bookName=bookService.findBookById(1);
        System.out.println(bookName);
    }
    
    @Test
    public void test3()
    {
        bookService.saveBook(new Book(2, "Android源码分析", "1002", 45, 10));
    }

}
