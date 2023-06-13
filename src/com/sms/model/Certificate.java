package com.sms.model;

public class Certificate {
	private int certId;
	private String certName;
	
	/*public Certificate(int certId,String certName){
		this.certId=certId;
		this.certName=certName;
	}*/
	public int getCertId() {
		return certId;
	}
	public void setCertId(int certId) {
		this.certId = certId;
	}
	public String getCertName() {
		return certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}
	
	@Override
	public String toString() {
		return this.certId+this.certName;
	}
	
}
