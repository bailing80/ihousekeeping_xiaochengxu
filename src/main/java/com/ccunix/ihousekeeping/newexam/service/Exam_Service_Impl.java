package com.ccunix.ihousekeeping.newexam.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.dao.Tb_base_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.Tb_submit_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.Tb_base;
import com.ccunix.ihousekeeping.basedb.domain.Tb_submit;
import com.ccunix.ihousekeeping.newexam.dao.Exam_Dao_Iface;
import com.ccunix.ihousekeeping.newexam.domain.QueryExamBean;

@Service("Exam_Service_Impl")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Exam_Service_Impl extends BaseService implements Exam_Service_Iface {

	@Resource
	Tb_submit_Dao_Iface tb_submit_Dao_Iface;

	@Resource
	Tb_base_Dao_Iface tb_base_Dao_Iface;
	@Resource
	Exam_Dao_Iface exam_Dao_Iface;

	@Override
	public AppDataModel add_exma_user(Tb_submit tb_submit) {

		AppDataModel appDataModel = getAppDataModel();

		try {
			tb_submit_Dao_Iface.insert_tb_submit(tb_submit);
			appDataModel.data.put("school", "gydx");
			appDataModel.status = 0;
		} catch (Exception e) {
			appDataModel.status = 1;
			appDataModel.message = "增加考试答案失败";
			e.printStackTrace();
		}

		return appDataModel;
	}

	@Override
	public AppDataModel get_exam() {
		AppDataModel appDataModel = getAppDataModel();
		try {
			List ls = tb_base_Dao_Iface.queryAll_tb_base(new Tb_base());

			appDataModel.data.put("exam_ls", ls);
			appDataModel.data.put("myname", "tim");
			appDataModel.data.put("sss", 22);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return appDataModel;
	}

	@Override
	public AppDataModel queryexam(QueryExamBean bean) throws Exception {
		AppDataModel appDataModel = getAppDataModel();
		List ls = exam_Dao_Iface.queryexam(bean);

		System.out.println(ls + "lslslslslslsls");
		// 集合往前送data 什么型 多少个都可以送
		appDataModel.data.put("myexam", ls);

		return appDataModel;
	}

	/*
	 * @Override public AppDataModel jisuanJieGuo(Tb_submit tb_submit) {
	 * 
	 * String[] str = answer.split(",");
	 * 
	 * int fs = 0; for(int i=0;i<str.length;i++) { if(str[i].equals("A")) { fs+=1; }
	 * } AppDataModel appDataModel = getAppDataModel();
	 * appDataModel.data.put("result", fs); return appDataModel; }
	 */
	@Override
	public AppDataModel commit(Tb_submit tb_submit) {

		AppDataModel appDataModel = getAppDataModel();
		List ls = null;

		List<String> answerList = new ArrayList<String>();

		try {
			ls = tb_base_Dao_Iface.queryAll_tb_base(new Tb_base());// 从数据库查所有题和答案
			if (ls.size() > 0) {
				for (int i = 0; i < ls.size(); i++) {
					answerList.add(i, ((Tb_base) (ls.get(i))).getAnswer());// 得到了一个封装答案的集合
				}
			}
			System.out.println(tb_submit.getAnswer());
			System.out.println(tb_submit.getName());
			System.out.println(tb_submit.getPhone() + "phone");
			List ls_old = exam_Dao_Iface.query_commit(tb_submit);
			int score = 0;
			int score_old = 0;
			// 打散
			String[] answerArr = tb_submit.getAnswer().split(",");
			for (int i = 0; i < answerArr.length; i++) {
				if (answerArr[i].equals(answerList.get(i))) {
					score += 20;
				}
				if (ls_old.size() > 0) {
					score_old = Integer.parseInt(((Tb_submit) ls_old.get(0)).getAnswer());
				}
			}

			// 分数高或者没有电话号码
			if (ls.size() == 0 || score >= score_old) {
				tb_submit.setAnswer(score + "");
				// 向数据库中插入数据
				tb_submit_Dao_Iface.insert_tb_submit(tb_submit);
				System.out.println(score + "scorescorescore");
				// （“键”，职）
				appDataModel.data.put("score", score);

			} else {
				System.out.println(score + "scorescorescore");
				// 数据库中存在号码 分数低
				appDataModel.data.put("score", score);
				appDataModel.data.put("score_old", score_old);
			}
			appDataModel.status = 0;
		} catch (Exception e) {
			appDataModel.status = 1;
			appDataModel.message = "增加考试答案失败";
			e.printStackTrace();
		}

		return appDataModel;
	}

	@Override
	public AppDataModel queryAnswerList(Tb_submit tb_submit) {
		AppDataModel appDataModel = getAppDataModel();
		List answerList = exam_Dao_Iface.queryAnswerList(tb_submit);
		appDataModel.data.put("answerList", answerList);
		return appDataModel;
	}
	
	
	
	
}
