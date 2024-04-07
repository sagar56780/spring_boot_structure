package edu.qs.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.qs.Employee.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	
	
}
