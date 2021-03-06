package com.ccunix.ihousekeeping.basedb.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.basedb.domain.Wangzhe;
import com.ccunix.ihousekeeping.basedb.service.Wangzhe_Service_Iface;

@Controller
@RequestMapping("Wangzhe_Controller")
public class Wangzhe_Controller extends BaseMultiController {
	@Resource
	public Wangzhe_Service_Iface wangzhe_service_iface;

}