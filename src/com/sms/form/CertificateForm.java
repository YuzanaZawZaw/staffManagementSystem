package com.sms.form;

import java.util.List;

import com.sms.model.Certificate;

public class CertificateForm {
	private int frmCertId;
	private String frmCertName;
	private List<Certificate> frmCertList;
	
	public int getFrmCertId() {
		return frmCertId;
	}
	public void setFrmCertId(int frmCertId) {
		this.frmCertId = frmCertId;
	}
	public String getFrmCertName() {
		return frmCertName;
	}
	public void setFrmCertName(String frmCertName) {
		this.frmCertName = frmCertName;
	}
	public List<Certificate> getFrmCertList() {
		return frmCertList;
	}
	public void setFrmCertList(List<Certificate> frmCertList) {
		this.frmCertList = frmCertList;
	}
	
}
