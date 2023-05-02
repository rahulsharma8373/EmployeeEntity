package com.apis.someproject.repo;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.apis.someproject.model.Employee;
import com.google.common.base.Optional;
@ApplicationScoped
public interface EmployeeRepo {

	public Employee saveEmployee(Employee emp);
	
	 public List<Employee> findAll();
	 public Optional<Employee> findById(int id);
}
