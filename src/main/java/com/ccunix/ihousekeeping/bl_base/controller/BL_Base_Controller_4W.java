package com.ccunix.ihousekeeping.bl_base.controller;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.service.PageServiceIface;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.basedb.domain.Tb_base;
import com.ccunix.ihousekeeping.basedb.domain.Wangzhetiku;
import com.ccunix.ihousekeeping.basedb.service.Tb_base_Service_Iface;
import com.ccunix.ihousekeeping.basedb.service.Wangzhetiku_Service_Iface;

@Controller
@RequestMapping("BL_Base_Controller_4W")
public class BL_Base_Controller_4W extends BaseMultiController {

	@Resource
	Tb_base_Service_Iface test_Service_Iface;

	@Resource
	PageServiceIface pageServiceIface;

	@RequestMapping("queryAllTest")
	@ResponseBody
	public List queryAllTest(Tb_base test) {
		List ls = null;
		try {
			ls = test_Service_Iface.queryAll_tb_base(test);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	@RequestMapping("add_test")
	@ResponseBody
	public void add_test(Tb_base test) {
		try {
			test.setId(UUID_Tools.getUUID());
			test_Service_Iface.insert_tb_base(test);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping("delete_test")
	@ResponseBody
	public void delete_test(Tb_base test) {
		try {
			test_Service_Iface.delete_tb_base(test);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
