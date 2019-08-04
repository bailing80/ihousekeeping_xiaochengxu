package com.ccunix.ihousekeeping.borrowbook.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.basedb.domain.Book;
import com.ccunix.ihousekeeping.basedb.domain.Tb_submit;
import com.ccunix.ihousekeeping.borrowbook.service.Borrowbook_Service_Iface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.newexam.domain.QueryExamBean;


@Controller
@RequestMapping("Borrowbook_Controller_4X")
public class Borrowbook_Controller_4X extends BaseMultiController {
	@Resource
	Borrowbook_Service_Iface borrowbook_service_iface;
	// 提交 
	@RequestMapping("showbook")
	@ResponseBody
	public AppDataModel_Sec showbook(Book book){
		AppDataModel appDataModel=borrowbook_service_iface.showbook(book);
	    appDataModel=borrowbook_service_iface.showbook(book);
		return getAppDataMode_sec().setData(encodeURI(appDataModel));
		
	}
	}
	
