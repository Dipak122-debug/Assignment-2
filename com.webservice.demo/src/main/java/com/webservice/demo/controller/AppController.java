package com.webservice.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.demo.model.Employee;

@RestController
@RequestMapping("/home")
@EnableAutoConfiguration
public class AppController {
	
	@GetMapping("/getUserName")
	public String getUserName(@RequestParam String userName) {
		return "Happy Learning "+userName;
	}
	
	@GetMapping("/getEmployeeDetails")
	public Employee getEmployeeDetails() {
		Employee empObj= new Employee();
		empObj.setEmpId("1942415");
		empObj.setEmpName("Dipak");
		empObj.setDesignation("Engineer");
		empObj.setLocation("Kolkata");
		
		return empObj;
		
	}
	
	@GetMapping("/getEmployeeFromUser")
	public Employee getEmployeeFromUser(@RequestBody Employee emp) {
		System.out.println("User Details :");
		System.out.println(emp);
		return emp;
	}

}
