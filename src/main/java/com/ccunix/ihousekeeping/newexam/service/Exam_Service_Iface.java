package com.ccunix.ihousekeeping.newexam.service;

import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.basedb.domain.Tb_submit;
import com.ccunix.ihousekeeping.newexam.domain.QueryExamBean;

public interface Exam_Service_Iface {

	public AppDataModel add_exma_user(Tb_submit submit);

	public AppDataModel get_exam();

	public AppDataModel queryexam(QueryExamBean bean) throws Exception;// 带参数

	// public AppDataModel jisuanJieGuo(Tb_submit tb_submit);

	public AppDataModel commit(Tb_submit tb_submit);

	public AppDataModel queryAnswerList(Tb_submit submit);

}
