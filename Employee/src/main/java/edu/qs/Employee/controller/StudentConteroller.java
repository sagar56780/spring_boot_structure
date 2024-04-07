package edu.qs.Employee.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.qs.Employee.entity.Student;
import edu.qs.Employee.response_structure.ResponseStructure;
import edu.qs.Employee.service.StudentService;

@RestController
public class StudentConteroller {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/student/{id}")
	public ResponseEntity<ResponseStructure<Student> >getStudent(@PathVariable int id){
		ResponseStructure<Student> rs=new ResponseStructure<Student>();
		Student student=new Student();
		student=studentService.getStudent(id);
		if(student!=null)
		{
			rs.setStatusCode(HttpStatus.ACCEPTED.value());
			rs.setMessage("Student data founded");
			rs.setData(student);
			
			return new ResponseEntity<ResponseStructure<Student>>(rs, HttpStatus.ACCEPTED);
			
			
		}
		else
		{
			rs.setStatusCode(HttpStatus.NOT_FOUND.value());
			rs.setMessage("student data not found");
			rs.setData(null);
			return new ResponseEntity<ResponseStructure<Student>>(rs, HttpStatus.NOT_FOUND);
		}
			
	}
	
	@PostMapping("/student")
	public ResponseEntity<ResponseStructure<String>> saveStudent(@RequestBody Student s)
	{
		System.err.println("check");
		ResponseStructure<String>rs=new ResponseStructure<String>();
	
		Student temp=studentService.getStudent(s.getId());
		
		if(temp==null)
		{
			boolean result =studentService.saveStudent(s);
			System.err.println(result);

			if(result==true)
			{
				
				System.out.println(" TEmp=======NULL");
				rs.setStatusCode(HttpStatus.ACCEPTED.value());
				rs.setMessage("success");
				rs.setData("Student data saved succesfully");
				return new ResponseEntity<ResponseStructure<String>>(rs,HttpStatus.ACCEPTED);
			}
		}
		else
		{
			
			 System.out.println("TEMP==!NULL");
			rs.setStatusCode(404);
			rs.setMessage("Student is allready present");
			rs.setData("not found");
			return new ResponseEntity<ResponseStructure<String>>(rs,HttpStatus.NOT_FOUND);
		
		}
		return new ResponseEntity<ResponseStructure<String>>(rs,HttpStatus.BAD_REQUEST);
	
		
	}
	
	
	

}
