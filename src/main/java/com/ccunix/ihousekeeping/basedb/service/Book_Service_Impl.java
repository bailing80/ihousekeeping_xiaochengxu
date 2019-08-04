package com.ccunix.ihousekeeping.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.domain.Book;
import com.ccunix.ihousekeeping.basedb.dao.Book_Dao_Iface;

@Service("Book_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Book_Service_Impl extends BaseService implements Book_Service_Iface {
@Resource
public Book_Dao_Iface book_dao_iface;
public void insert_book(Book book) throws Exception{
book_dao_iface.insert_book(book);
}
public void update_book(Book book) throws Exception{
book_dao_iface.update_book(book);
}
public void delete_book(Book book) throws Exception{
book_dao_iface.delete_book(book);
}
public List queryAll_book(Book book) throws Exception{
return book_dao_iface.queryAll_book(book);
}
public List queryBy_book(Book book) throws Exception{
return book_dao_iface.queryBy_book(book);
}
}