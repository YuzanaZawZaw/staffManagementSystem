package com.sms.form;

import java.util.List;

import com.sms.model.Staff;

public class StaffForm {
	private String frmId;
	private String frmName;
	private String frmDob;
	private String frmExp;
	private String frmCert;
	private CertificateForm frmCertificate;
	
	private List<Staff> frmStaffs;
	
	public String getFrmId() {
		return frmId;
	}
	public void setFrmId(String frmId) {
		this.frmId = frmId;
	}
	public String getFrmName() {
		return frmName;
	}
	public void setFrmName(String frmName) {
		this.frmName = frmName;
	}
	public String getFrmDob() {
		return frmDob;
	}
	public void setFrmDob(String frmDob) {
		this.frmDob = frmDob;
	}
	public String getFrmExp() {
		return frmExp;
	}
	public void setFrmExp(String frmExp) {
		this.frmExp = frmExp;
	}
	public String getFrmCert() {
		return frmCert;
	}
	public void setFrmCert(String frmCert) {
		this.frmCert = frmCert;
	}
	public List<Staff> getFrmStaffs() {
		return frmStaffs;
	}
	public void setFrmStaffs(List<Staff> frmStaffs) {
		this.frmStaffs = frmStaffs;
	}
	public CertificateForm getFrmCertificate() {
		return frmCertificate;
	}
	public void setFrmCertificate(CertificateForm frmCertificate) {
		this.frmCertificate = frmCertificate;
	}
	
	
}
