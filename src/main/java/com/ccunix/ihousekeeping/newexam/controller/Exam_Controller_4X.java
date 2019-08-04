package com.ccunix.ihousekeeping.newexam.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.basedb.domain.Tb_submit;
import com.ccunix.ihousekeeping.base.util.UUID_Tools;
import com.ccunix.ihousekeeping.newexam.domain.QueryExamBean;
import com.ccunix.ihousekeeping.newexam.service.Exam_Service_Iface;

@Controller
@RequestMapping("Exam_Controller_4X")
public class Exam_Controller_4X extends BaseMultiController {
	@Resource
	Exam_Service_Iface exam_service_iface;

	// 添加保存
	@RequestMapping("submit")
	@ResponseBody
	public AppDataModel_Sec submit(Tb_submit tb_submit) {

		System.out.println(tb_submit.getAnswer());

		tb_submit.setId(UUID_Tools.getUUID());
		AppDataModel appDataModel = exam_service_iface.commit(tb_submit);

		return getAppDataMode_sec().setData(encodeURI(appDataModel));
	}

	@RequestMapping("add_user_exam")
	@ResponseBody
	public AppDataModel_Sec add_user_exam(Tb_submit submit) {

		submit.setId(UUID_Tools.getUUID());
		AppDataModel appDataModel = exam_service_iface.add_exma_user(submit);

		return getAppDataMode_sec().setData(encodeURI(appDataModel));

	}

	@RequestMapping("queryAnswerList")
	@ResponseBody
	public AppDataModel_Sec queryAnswerList(Tb_submit submit) {

		AppDataModel appDataModel = exam_service_iface.queryAnswerList(submit);

		return getAppDataMode_sec().setData(encodeURI(appDataModel));

	}
	// 关键字

	@RequestMapping("queryexam")
	@ResponseBody
	public AppDataModel_Sec queryexam(QueryExamBean bean) {

		System.out.println(bean.getKeyword() + "bean.getKeyword()");

		AppDataModel appDataModel = null;
		try {
			appDataModel = exam_service_iface.queryexam(bean);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return getAppDataMode_sec().setData(encodeURI(appDataModel));
	}

	@RequestMapping("get_user_exam")
	@ResponseBody
	public AppDataModel_Sec get_user_exam() {
		AppDataModel appDataModel = exam_service_iface.get_exam();

		return getAppDataMode_sec().setData(encodeURI(appDataModel));
	}

}
