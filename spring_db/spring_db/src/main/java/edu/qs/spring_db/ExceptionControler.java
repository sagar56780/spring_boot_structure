package edu.qs.spring_db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.qs.spring_db.entity.Cricketer;
import edu.qs.spring_db.repository.CricketerRepository;

@RestController
public class ExceptionControler {
	@Autowired
	CricketerRepository repo;
	
	@GetMapping("/get_length")
	public String getnameLength(@RequestBody Cricketer c) {
		if(c.getName().length()>3)
		{
			return "name greater than 3";
		}
		else {
			return "name length less than 3";
		}
		
	}

}
