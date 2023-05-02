package com.apis.someproject.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.apis.someproject.model.Employee;
import com.apis.someproject.repo.EmployeeRepo;
import com.google.common.base.Optional;
@ApplicationScoped
public class EmployeeServiceImpl implements EmployeeService {
	
@Inject
private EmployeeRepo repo;
	@Override
	public Employee saveEmployee(Employee emp) {
		
		return repo.saveEmployee(emp);
	}
	@Override
	public List<Employee> findAll() {
		
		return repo.findAll();
	}
	@Override
	public Optional<Employee> findById(int id) {
		
		return repo.findById(id);
	}

}
