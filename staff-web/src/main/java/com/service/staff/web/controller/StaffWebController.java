package com.service.staff.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.staff.web.service.StaffWebService;

@Controller
public class StaffWebController {

	private final static  Logger logger = LoggerFactory.getLogger(StaffWebController.class);

	@Autowired
	private StaffWebService service;

	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("message", "Welcome to MyApp");
		model.addAttribute("emps", service.fetchAllEmployees());
		return "index";
	}

	@RequestMapping("/")
	public String main(Model model) {
		model.addAttribute("message", "Welcome to MyApp");
		model.addAttribute("emps", service.fetchAllEmployees());

		return "index"; // view
	}

	@RequestMapping(value = "/find/employee", method = RequestMethod.GET)
	public String search(@RequestParam(value = "search") String fistname, Model model) {
		logger.info("**StaffWeb Controller >> Field Value >> ###" + fistname+" #### "+service.findEmployeesByFname(fistname));
		model.addAttribute("emps", service.findEmployeesByFname(fistname));
		model.addAttribute("message", "Welcome to MyApp");
		
		return "index"; // view
	}
}
