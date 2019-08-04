package com.ccunix.ihousekeeping.newexam.dao;

import java.util.List;

import com.ccunix.ihousekeeping.basedb.domain.Tb_submit;
import com.ccunix.ihousekeeping.newexam.domain.QueryExamBean;

public interface Exam_Dao_Iface {

	public List queryAllexam() throws Exception;

	public List queryexam(QueryExamBean bean) throws Exception;

	public List query_commit(Tb_submit tb_submit) throws Exception;

	public List queryAnswerList(Tb_submit tb_submit);

}
