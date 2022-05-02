package com.broadway.healthCare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.broadway.healthCare.model.Doctor;
import com.broadway.healthCare.service.IDoctorService;

@Controller
public class DoctorController {
	@Autowired
	private IDoctorService service;
	
	@GetMapping("/addDoctor")
	public String getDoctorForm() {
		return"doctorForm";
	}
	 @PostMapping("/doctorAdd")
	 public String postDoctorForm(@ModelAttribute Doctor doctor) {
		 service.addDoctor(doctor);
		 return"redirect:/addDoctor";
	 }
	 
	 
	 @GetMapping("/listOfDoctor")
	 public String getDoctorList(Model model) {
		 model.addAttribute("list",service.doctorList());
		 return "doctorList";
	 }
	 @GetMapping("/delete")
	 public String deleteDoctor(@RequestParam int id) {
		 service.deleteDoctor(id);
		 return "redirect:/listOfDoctor";
	 }
	 @GetMapping("/edit")
	 public String editDoctor(@RequestParam int id,Model model) {
		 model.addAttribute("doctor",service.selectByid(id));
		 return"editFormOfDoctor";
	 }
	 
	 @PostMapping("/updateDoctor")
	 public String updateDoctor(@ModelAttribute Doctor doctor) {
		 service.updateDoctor(doctor);
		 
		 return"redirect:/listOfDoctor";
	 }

}
