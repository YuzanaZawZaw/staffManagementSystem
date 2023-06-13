package com.sms.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sms.form.StaffForm;
import com.sms.service.StaffService;

@Controller
public class StaffController {
	
	@Autowired
	private StaffService staffService;
	
	@RequestMapping(value={"/","/newPath"})
	public String dispatchHome(ModelMap modelMap){
		StaffForm myForm=new StaffForm();
		this.staffService.processLoad(myForm);
		modelMap.addAttribute("staffForm",myForm);
		modelMap.addAttribute("staffList", myForm.getFrmStaffs());
		return "home";
	}
	@RequestMapping(value="/savePath",method=RequestMethod.POST)
	public String dispatchSave(
			@ModelAttribute("staffForm")StaffForm myForm,
			ModelMap modelMap) throws ParseException{
		if(myForm.getFrmId()==null || myForm.getFrmId().isEmpty())
			this.staffService.processSave(myForm);	
		else
			this.staffService.processUpdate(myForm);
		modelMap.addAttribute("staffList", myForm.getFrmStaffs());
		return "home";
	}
	@RequestMapping("/updatePath")
	public String dispatchLoadUpdate(
			@RequestParam("frmId")int id,
			ModelMap modelMap){
		StaffForm myForm=new StaffForm();
		myForm.setFrmId(""+id);
		this.staffService.processUpdateLoad(myForm);
		modelMap.addAttribute("staffForm",myForm);
		modelMap.addAttribute("staffList", myForm.getFrmStaffs());
		return "home";
	}
	@RequestMapping("/deletePath")
	public String dispatchDelete(
			@RequestParam("frmId")int id,
			ModelMap modelMap){
		StaffForm myForm=new StaffForm();
		myForm.setFrmId(""+id);
		this.staffService.processDelete(myForm);
		modelMap.addAttribute("staffForm",myForm);
		modelMap.addAttribute("staffList", myForm.getFrmStaffs());
		return "home";
	}
}
