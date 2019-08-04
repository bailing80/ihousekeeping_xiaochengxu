package com.ccunix.ihousekeeping.newexam.domain;

import com.ccunix.ihousekeeping.base.domain.Base_Model;

//继承basemodel
public class QueryExamBean extends Base_Model {
	// 要收取一个属性
	public String keyword;

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

}
