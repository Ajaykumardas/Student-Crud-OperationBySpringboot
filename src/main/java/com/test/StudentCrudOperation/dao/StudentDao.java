package com.test.StudentCrudOperation.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.StudentCrudOperation.dto.Student;
import com.test.StudentCrudOperation.repository.StudentRepo;

@Repository
public class StudentDao {
	@Autowired
	private StudentRepo studentRepo;
	
	//save student
	public Student saveStudent(Student student)
	{
		return studentRepo.save(student);
	}
	//getStudent
	public List<Student> getStudent()
	{
		return studentRepo.findAll();
	}
	//update Student email
	
	public String updateEmail(Student student,int id)
	{
	    Optional<Student> optional=studentRepo.findById(id);
	
	     if(!optional.isEmpty())
	     {
	    	 Student student1=optional.get();
	    	 student1.setEmail(student.getEmail());
	    	 studentRepo.save(student1);
	    	 return "email is updated successfully";
	     }
	     else
	    	 return "data is not found";
	
	}
     
	//delete student
	public String deleteStudent(int id)
	{
		Optional<Student> optional=studentRepo.findById(id);
		if(!optional.isEmpty())
		{
			Student student=optional.get();
			studentRepo.delete(student);
			
			return "data is deleted successfully";
		}
		else
			return "id is not present";
	}
	
	
	
	

}
