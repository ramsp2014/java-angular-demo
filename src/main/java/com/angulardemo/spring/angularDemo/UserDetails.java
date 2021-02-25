package com.angulardemo.spring.angularDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

import com.sun.istack.NotNull;

@Entity
@IdClass(UserKeys.class)
public class UserDetails {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long userId;
	@NotNull
	private String userName;
	@NotNull

	@Id
	private String mobileNumber;
	private String country;
	private String state;
	private String city;

	@ManyToOne
	private LabourDetails lDetails;

	public LabourDetails getlDetails() {
		return lDetails;
	}

	public void setlDetails(LabourDetails lDetails) {
		this.lDetails = lDetails;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

}
