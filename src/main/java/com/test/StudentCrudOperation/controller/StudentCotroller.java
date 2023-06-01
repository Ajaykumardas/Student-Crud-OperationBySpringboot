package com.test.StudentCrudOperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.StudentCrudOperation.dto.Student;
import com.test.StudentCrudOperation.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentCotroller {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student)
	{
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/getAll")
	public List<Student> getStudent()
	{
		return studentService.getStudent();
	}
	
	@PutMapping("update/{id}")
	public String updateEmail(@RequestBody Student student,@PathVariable int id)
	{
		return studentService.updateEmail(student, id);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		return studentService.deleteStudent(id);
	}



}
