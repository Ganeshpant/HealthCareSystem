package com.broadway.healthCare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.broadway.healthCare.model.Admin;
import com.broadway.healthCare.service.IAdminService;

@Controller
public class AdminController {
	@Autowired 
	private IAdminService service;
	@GetMapping("/addAdmin")
	public String getAdminForm(@ModelAttribute Admin admin, Model model) {
		
		service.addAdmin(admin);
		return"adminform";
	}
	
	@GetMapping("/adminManagement")
	public String adminManagement(Model model) {
		model.addAttribute("adminList", service.showAdminList());
		return"adminManagementPage";
	}
	
	

}
