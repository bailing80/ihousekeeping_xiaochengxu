package com.ccunix.ihousekeeping.basedb.service;
import com.ccunix.ihousekeeping.basedb.domain.Book;
import java.util.List;
public interface Book_Service_Iface {
public void insert_book(Book book) throws Exception;
public void update_book(Book book) throws Exception;
public void delete_book(Book book) throws Exception;
public List queryAll_book(Book book) throws Exception;
public List queryBy_book(Book book) throws Exception;
}
