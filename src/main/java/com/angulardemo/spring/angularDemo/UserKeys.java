package com.angulardemo.spring.angularDemo;

import java.io.Serializable;

public class UserKeys implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long userId;
	private String mobileNumber;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
