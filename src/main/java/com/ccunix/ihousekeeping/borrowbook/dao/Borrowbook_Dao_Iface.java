package com.ccunix.ihousekeeping.borrowbook.dao;

import java.util.List;

import com.ccunix.ihousekeeping.basedb.domain.Book;
import com.ccunix.ihousekeeping.basedb.domain.Tb_submit;
import com.ccunix.ihousekeeping.newexam.domain.QueryExamBean;

public interface Borrowbook_Dao_Iface {
	public  List showbook(Book book);
}
