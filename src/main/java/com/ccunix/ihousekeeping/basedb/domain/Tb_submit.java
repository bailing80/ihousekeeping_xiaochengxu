package com.ccunix.ihousekeeping.basedb.domain;

import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import java.util.Date;

public class Tb_submit extends Base_Model_Business {
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

	private String answer;

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAnswer() {
		return this.answer;
	}
}
