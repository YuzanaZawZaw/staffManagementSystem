package com.sms.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.sms.dao.StaffDao;

import com.sms.form.StaffForm;

import com.sms.model.Staff;

public class StaffService {
	private StaffDao myStaffDao;
	public void processLoad(StaffForm myForm){
		myForm.setFrmId(null);
		myForm.setFrmStaffs(this.myStaffDao.getAll());
	}
	public void processUpdateLoad(StaffForm myForm){
		myForm.setFrmId(myForm.getFrmId());
		Staff p=this.myStaffDao.getStaffById(
				Integer.parseInt(myForm.getFrmId()));
		myForm.setFrmName(p.getStaffName());
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		myForm.setFrmDob(sdf.format(p.getStaffDob()));
		myForm.setFrmExp(""+p.getStaffExp());
		myForm.setFrmCert(""+p.getStaffCert());
		
		myForm.setFrmId(null);
		myForm.setFrmName(null);
		myForm.setFrmDob(null);
		myForm.setFrmExp(null);
		myForm.setFrmCert(null);
		
		myForm.setFrmStaffs(this.myStaffDao.getAll());
	}
	public void processUpdate(StaffForm myForm) throws ParseException{
		Staff s=new Staff();
		s.setStaffId(Integer.parseInt(myForm.getFrmId()));
		s.setStaffName(myForm.getFrmName());
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		s.setStaffDob(sdf.parse(myForm.getFrmDob()));
		s.setStaffExp(Integer.parseInt(myForm.getFrmExp()));
		//s.setStaffCert(myForm.getFrmCertificate().getFrmCertName());
		this.myStaffDao.updateStaff(s);
		
		myForm.setFrmId(null);
		myForm.setFrmName(null);
		myForm.setFrmDob(null);
		myForm.setFrmExp(null);
		myForm.setFrmCert(null);
		
		myForm.setFrmStaffs(this.myStaffDao.getAll());
	}
	public void processDelete(StaffForm myForm){
		this.myStaffDao.deleteStaff(Integer.parseInt(myForm.getFrmId()));
		myForm.setFrmId(null);
		myForm.setFrmStaffs(this.myStaffDao.getAll());
	}
	public void processSave(StaffForm myForm) throws ParseException{
		Staff s=new Staff();
		s.setStaffName(myForm.getFrmName());
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		s.setStaffDob(sdf.parse(myForm.getFrmDob()));
		s.setStaffExp(Integer.parseInt(myForm.getFrmExp()));
		//s.setStaffCert(myForm.getFrmCert());
		
		this.myStaffDao.saveStaff(s);
		myForm.setFrmId(null);
		myForm.setFrmName(null);
		myForm.setFrmDob(null);
		myForm.setFrmExp(null);
		myForm.setFrmCert(null);
		myForm.setFrmStaffs(this.myStaffDao.getAll());
	}

	public void setMyStaffDao(StaffDao myStaffDao) {
		this.myStaffDao = myStaffDao;
	}
}
