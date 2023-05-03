package com.ps.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int regId;
	
	private int uPhone;
	
	private String uEmail;
	
	private String uName;
	
	private String uPwd;

	public int getRegId() {
		return regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	public int getuPhone() {
		return uPhone;
	}

	public void setuPhone(int uPhone) {
		this.uPhone = uPhone;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPwd() {
		return uPwd;
	}

	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Registration(int regId, int uPhone, String uEmail, String uName, String uPwd) {
		super();
		this.regId = regId;
		this.uPhone = uPhone;
		this.uEmail = uEmail;
		this.uName = uName;
		this.uPwd = uPwd;
	}

	@Override
	public String toString() {
		return "Registration [regId=" + regId + ", uPhone=" + uPhone + ", uEmail=" + uEmail + ", uName=" + uName
				+ ", uPwd=" + uPwd + "]";
	}
	

	
}
