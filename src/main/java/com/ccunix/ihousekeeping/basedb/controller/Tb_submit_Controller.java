package com.ccunix.ihousekeeping.basedb.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.basedb.domain.Tb_submit;
import com.ccunix.ihousekeeping.basedb.service.Tb_submit_Service_Iface;

@Controller
@RequestMapping("Tb_submit_Controller")
public class Tb_submit_Controller extends BaseMultiController {
	@Resource
	public Tb_submit_Service_Iface tb_submit_service_iface;

}