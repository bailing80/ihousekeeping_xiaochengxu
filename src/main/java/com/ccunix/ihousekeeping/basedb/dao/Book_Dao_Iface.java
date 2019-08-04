package com.ccunix.ihousekeeping.basedb.dao;
import java.util.List;

import com.ccunix.ihousekeeping.base.util.DataSourceType;
import com.ccunix.ihousekeeping.basedb.domain.Book;
@DataSourceType(DataSourceType.main)
public interface Book_Dao_Iface {
public void insert_book(Book book) throws Exception;
public void update_book(Book book) throws Exception;
public void delete_book(Book book) throws Exception;
public List queryAll_book(Book book) throws Exception;
public List queryBy_book(Book book) throws Exception;
}
