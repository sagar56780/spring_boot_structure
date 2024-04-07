package edu.qs.sprint_boot_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pojo_classes.Cricketer;
import pojo_classes.Mobile;
import pojo_classes.Team;

@RestController
public class RestControlDemo {
	@Autowired
	Employee emp;
	@Autowired
	Mobile mob;
	
	@GetMapping("/getmobile")
	public Mobile getMobile() {
		mob.setBrand("iphone");
		mob.setBrand("apple");
		mob.setPrice(80000);
		return mob;
	}
	@PostMapping("employee/{id}/{name}/{salary}")
	
	public void setEmployee(@PathVariable int id,@PathVariable String  name,@PathVariable Double salary)
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	
	@GetMapping("/display")
	public String display()
	{
		return "hello Boot";
	}
	@GetMapping("/getmap")
	public Employee getEmployee() {
		emp.setId(101);
		emp.setName("vikas");
		emp.setSalary(30000);
		return  emp;
		
	}
//	@PostMapping("/cricketer")
//	public void setCricketer(@RequestParam String name,@RequestParam int age,@RequestParam String team) {
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(team);
//	
//	}
	@PostMapping("/student")
	public void setStudent(@RequestHeader int id,@RequestHeader String name,@RequestHeader double percentage)
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(percentage);
		
	}
	@PostMapping("cricketer")
	public void setCricketer(@RequestBody Cricketer c) {
		System.out.println(c);
	}
	@PostMapping("/team")
	public void setTeam(@RequestBody Team team){
		System.out.println(team);
	
	}
	
}