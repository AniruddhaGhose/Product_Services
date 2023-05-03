package com.ps.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ps.entity.Registration;
import com.ps.entity.User;
import com.ps.service.RegServices;

@Controller
public class UserController {

	@Autowired
	private RegServices regServices;

	@RequestMapping("/register")
	public String userReg() {
		System.out.println("This is registration");
		return "registration";
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String addReg(@ModelAttribute Registration registration, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "registration";
		}
		regServices.addReg(registration);

		return "login";
	}

	@RequestMapping(path = "/product", method = RequestMethod.POST)
	public String userProfile(@ModelAttribute User user, Model model) {

		return "add-product";

	}
}
