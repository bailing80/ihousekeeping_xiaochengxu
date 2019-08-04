package com.ccunix.ihousekeeping.basedb.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.basedb.domain.Wangzhetiku;
import com.ccunix.ihousekeeping.basedb.service.Wangzhetiku_Service_Iface;

@Controller
@RequestMapping("Wangzhetiku_Controller")
public class Wangzhetiku_Controller extends BaseMultiController {
	@Resource
	public Wangzhetiku_Service_Iface wangzhetiku_service_iface;

}