package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	@RequestMapping("/userform")
	public String userForm() {
		return "user-form";
	}

	@RequestMapping("/processUserForm")
	public String processUserForm(@RequestParam("name") String userName, HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		model.addAttribute("userName", name.toUpperCase());
		model.addAttribute("userNameByRequestParam", "Mr. " + userName);
		return "user-info";
	}
}
