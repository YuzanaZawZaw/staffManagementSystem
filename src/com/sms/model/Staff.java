package com.sms.model;

import java.util.Date;

public class Staff {
	private int staffId;
	private String staffName;
	private Date staffDob;
	private int staffExp;
	private Certificate staffCert;
	
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public Date getStaffDob() {
		return staffDob;
	}
	public void setStaffDob(Date staffDob) {
		this.staffDob = staffDob;
	}
	public int getStaffExp() {
		return staffExp;
	}
	public void setStaffExp(int staffExp) {
		this.staffExp = staffExp;
	}
	public Certificate getStaffCert() {
		return staffCert;
	}
	public void setStaffCert(Certificate staffCert) {
		this.staffCert = staffCert;
	}
	
	
}
