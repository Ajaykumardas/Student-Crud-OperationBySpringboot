package com.test.StudentCrudOperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.StudentCrudOperation.dto.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
