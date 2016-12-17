package com.demo.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.dao.BookDao;
import com.demo.entity.Book;

@Repository
public class BookDaoImpl implements BookDao
{
    @Autowired
    private SessionFactory sessionFactory;
    
    //��ȡ�͵�ǰ�̰߳󶨵�Seesion
    private Session getSession()
    {
        return sessionFactory.openSession();
    }
    public String findBookById(int id)
    {
        String hql="SELECT bookName from Book where id=?";
        Query query=getSession().createQuery(hql).setInteger(0, id);
        String str= query.uniqueResult().toString();
        return str;
    }
    public void saveBook(Book book)
    {
        getSession().save(book);
    }
}