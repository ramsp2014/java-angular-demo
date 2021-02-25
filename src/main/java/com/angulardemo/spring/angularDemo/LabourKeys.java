package com.angulardemo.spring.angularDemo;

import java.io.Serializable;

public class LabourKeys implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long labourId;
	private String mobileNumber;

	public String getMobileNumber() {
		return mobileNumber;
	}

	public Long getLabourId() {
		return labourId;
	}

	public void setLabourId(Long labourId) {
		this.labourId = labourId;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
