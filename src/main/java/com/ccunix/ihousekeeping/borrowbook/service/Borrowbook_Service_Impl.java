package com.ccunix.ihousekeeping.borrowbook.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.domain.Book;
import com.ccunix.ihousekeeping.borrowbook.dao.Borrowbook_Dao_Iface;

@Service("Borrowbook_Service_Impl")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Borrowbook_Service_Impl extends BaseService implements Borrowbook_Service_Iface {

	@Resource
	Borrowbook_Dao_Iface borrowbook_Dao_Iface;

	
	@Override
	public AppDataModel showbook(Book book) {
		AppDataModel appDataModel = getAppDataModel();
	    List count = borrowbook_Dao_Iface.showbook(book);
	    
	    System.out.println(count.size()+"ssssssssssssssssssss");
		System.out.println(count);
		for(int i = 0;i<count.size();i++) {
			System.out.println(count.get(i));
		}
		appDataModel.data.put("count", count);
		return appDataModel;
	
	}	
}
