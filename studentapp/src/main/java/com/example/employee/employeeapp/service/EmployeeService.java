package com.example.employee.employeeapp.service;

import java.util.List;

import com.example.employee.employeeapp.model.Employees;

public interface EmployeeService {
	
	public List<Employees> getAllEmps();
	public void insertEmp(Employees employee);
	public void deleteEmp(int id);
	public void updateEmp(Employees employee);


}
