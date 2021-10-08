package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class HospitalController {
	@Autowired
	private HospitalService hservice;
	
	
	
	@PostMapping("/addPatient")
	public String addPatientForm() {
		return "addPatient";
	}
	
	
	
	@PostMapping("/addPatient")
	public String patientSave(@ModelAttribute Hospital p,HttpSession session) {
		System.out.println(p);
		hservice.admitpatient(p);
		session.setAttribute("msg", "Patient added successfully..");
		return "redirect:/viewPatient";
	}
	
	
	
	@GetMapping("/viewPatient")
	public String patientView(Model m) {
		List<Hospital> pat = hservice.getAllMed();
		m.addAttribute("patient", pat);
		return "viewPatient";
	}
	
		
	@GetMapping("/deletepat/{id}")
	public String medDelete(@PathVariable String id,HttpSession session) {
		hservice.deleteDisPatient(id);
		session.setAttribute("msg", "Patient deleted successfully..");
		return "redirect:/viewPatient";
	}
		
}


