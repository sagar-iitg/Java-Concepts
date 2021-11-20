package com.in28minutes.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.springboot.web.service.LoginService;

@Controller
public class LoginController {

	// Injected automatically
	@Autowired
	LoginService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET) //

	public String showLoginPage(ModelMap model) {
		// model.put("name", name);
//		System.out.println("name is " + name);
		return "login";

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST) //
	public String LoginMessage(ModelMap model, @RequestParam String password, @RequestParam String name) {
		boolean isValidUser = service.validateUser(name, password);

		if (!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		model.put("name", name);
		model.put("password", password);
		return "welcome";

	}
}
