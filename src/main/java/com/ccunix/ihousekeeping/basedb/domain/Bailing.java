package com.ccunix.ihousekeeping.basedb.domain;

import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import java.util.Date;

public class Bailing extends Base_Model_Business {
	private Integer answer;

	public void setAnswer(Integer answer) {
		this.answer = answer;
	}

	public Integer getAnswer() {
		return this.answer;
	}

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	private String phone;

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return this.phone;
	}
}
