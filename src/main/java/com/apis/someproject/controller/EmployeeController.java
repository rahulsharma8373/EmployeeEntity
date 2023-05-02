package com.apis.someproject.controller;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import com.apis.someproject.model.Employee;
import com.apis.someproject.service.EmployeeService;
import com.google.common.base.Optional;

@Path("/emp")
@RequestScoped
public class EmployeeController {

	@Inject
	private EmployeeService service;

	@Path("/saveEmployee")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Employee saveEmployee(@RequestBody Employee emp) {
		return service.saveEmployee(emp);

	}

	@Path("/findAll")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> findAll() {
		return service.findAll();

	}
	@Path("{id}")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Optional<Employee> findById(@PathParam("id") final int id) {
		return service.findById(id);

	}

}
