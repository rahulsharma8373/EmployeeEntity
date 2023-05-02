package com.apis.someproject.service;

import java.util.List;

import com.apis.someproject.model.Employee;
import com.google.common.base.Optional;

public interface EmployeeService {
	public Employee saveEmployee(Employee emp);
	 public List<Employee> findAll();
	 public Optional<Employee> findById(int id);
}
