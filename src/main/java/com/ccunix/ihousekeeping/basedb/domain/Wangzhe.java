package com.ccunix.ihousekeeping.basedb.domain;

import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import java.util.Date;

public class Wangzhe extends Base_Model_Business {
	private String category;

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategory() {
		return this.category;
	}

	private String merchandise;

	public void setMerchandise(String merchandise) {
		this.merchandise = merchandise;
	}

	public String getMerchandise() {
		return this.merchandise;
	}

	private Integer price;

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getPrice() {
		return this.price;
	}
}
