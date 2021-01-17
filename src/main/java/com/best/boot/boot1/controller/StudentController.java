package com.best.boot.boot1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.best.boot.boot1.dao.StudentDao;
import com.best.boot.boot1.model.Student;

@Controller
public class StudentController {
	@Autowired
	private StudentDao studentDao;
	@GetMapping("/new_student.htm")
	public String createStudent(Model model) {
		model.addAttribute("student", new Student());
		return "new_student";
	}
	@PostMapping("/new_student.htm")
	public String postStudent(@ModelAttribute(value="student")Student student) {
		studentDao.save(student);
		return "redirect:/list.htm";
	}
	@GetMapping("/list.htm")
	public String list(Model model) {
		model.addAttribute("studentList", studentDao.findAll());
		return "student_list";
	}

}
