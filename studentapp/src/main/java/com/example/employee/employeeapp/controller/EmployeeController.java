package com.example.employee.employeeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.employeeapp.model.Employees;
import com.example.employee.employeeapp.service.EmployeeService;

@RestController
public class EmployeeController {
	
	
	@Autowired
	EmployeeService service;
	
	
	@GetMapping("/all")
	public List<Employees> showAllEmps(){
		return service.getAllEmps();
	}
	
	@PostMapping("/add")
	public String addEmployee(@RequestBody Employees employee) {
		service.insertEmp(employee);
		return "Employee Added";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		service.deleteEmp(id);
		return "Employee deleted";
	}
	
	@PutMapping("/update")
	public String updateEmployee(@RequestBody Employees employee) {
		service.updateEmp(employee);
		return "Employee Added";
	}

}
