package com.ccunix.ihousekeeping.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.basedb.domain.Book;
import com.ccunix.ihousekeeping.basedb.service.Book_Service_Iface;
@Controller
@RequestMapping("Book_Controller")
public class Book_Controller extends BaseMultiController {
@Resource
public Book_Service_Iface book_service_iface;







}