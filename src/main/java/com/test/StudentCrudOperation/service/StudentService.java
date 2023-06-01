package com.test.StudentCrudOperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.StudentCrudOperation.dao.StudentDao;
import com.test.StudentCrudOperation.dto.Student;
import com.test.StudentCrudOperation.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	//save student
	public Student saveStudent(Student student)
	{
		return studentDao.saveStudent(student);
	}
	//display student
	public List<Student> getStudent()
	{
		return studentDao.getStudent();
	}
	
	//update student
	public String updateEmail(Student student,int id)
	{
		return studentDao.updateEmail(student, id);
	}
	//delete student
	public String deleteStudent(int id)
	{
		return studentDao.deleteStudent(id);
	}

}
