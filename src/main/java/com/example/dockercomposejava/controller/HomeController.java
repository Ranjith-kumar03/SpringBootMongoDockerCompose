package com.example.dockercomposejava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dockercomposejava.model.Student;
import com.example.dockercomposejava.repository.StudentRepository;

@RestController
@RequestMapping("/school")
public class HomeController {

	@Autowired
	private StudentRepository _repository;
	
	@GetMapping("/students")
	public List<Student> getAllStudents()
	{
		return _repository.findAll();
	}
	 
	@PostMapping("/students")
	public Student addStudents(@RequestBody Student student)
	{
		_repository.save(student);
		
		Student student_added = _repository.findByRollno(student.getRollno());
		
		return student_added;
		
	}
}
