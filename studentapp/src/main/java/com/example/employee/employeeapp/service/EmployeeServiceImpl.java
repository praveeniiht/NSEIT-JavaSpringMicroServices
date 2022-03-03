package com.example.employee.employeeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.employeeapp.model.Employees;
import com.example.employee.employeeapp.repo.EmployeeRepo;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepo repo;
	
	@Override
	public List<Employees> getAllEmps() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void insertEmp(Employees employee) {
		// TODO Auto-generated method stub
		repo.save(employee);
	}

	@Override
	public void deleteEmp(int id) {
		// TODO Auto-generated method stub
		
		repo.deleteById(id);
		
	}

	@Override
	public void updateEmp(Employees employee) {
		// TODO Auto-generated method stub
		repo.save(employee);
		
	}

}
