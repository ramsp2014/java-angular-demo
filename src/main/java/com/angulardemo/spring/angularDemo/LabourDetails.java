package com.angulardemo.spring.angularDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToOne;

import com.sun.istack.NotNull;

@Entity
@IdClass(LabourKeys.class)
public class LabourDetails {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long labourId;
	@NotNull
	private String LabourName;
	@NotNull

	@Id
	private String mobileNumber;
	private String country;
	private String state;
	private String city;
	private Integer rating;
	@OneToOne
	private Category category;
	private String remarks;
	
	

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Long getLabourId() {
		return labourId;
	}

	public void setLabourId(Long labourId) {
		this.labourId = labourId;
	}

	public String getLabourName() {
		return LabourName;
	}

	public void setLabourName(String labourName) {
		LabourName = labourName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
