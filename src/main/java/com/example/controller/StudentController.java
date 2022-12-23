package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Student;

@Controller
public class StudentController {

	@RequestMapping("/studentForm")
	public String studentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "student-form";
	}

	@RequestMapping("/processStudentForm")
	public String processStudent(@ModelAttribute("student") Student student) {
		System.out.println(student);
		return "processed-form";
	}
}
