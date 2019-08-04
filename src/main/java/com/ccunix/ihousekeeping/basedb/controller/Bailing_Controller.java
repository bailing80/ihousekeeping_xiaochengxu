package com.ccunix.ihousekeeping.basedb.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.basedb.domain.Bailing;
import com.ccunix.ihousekeeping.basedb.service.Bailing_Service_Iface;

@Controller
@RequestMapping("Bailing_Controller")
public class Bailing_Controller extends BaseMultiController {
	@Resource
	public Bailing_Service_Iface bailing_service_iface;

}