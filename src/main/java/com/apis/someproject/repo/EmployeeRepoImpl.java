package com.apis.someproject.repo;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.sql.DataSource;
import javax.transaction.Transactional;

import com.apis.someproject.model.Employee;
import com.google.common.base.Optional;

@ApplicationScoped
public class EmployeeRepoImpl implements EmployeeRepo {

	@PersistenceContext
	EntityManager entityManager;

	@Inject
	@Named("test")
	private DataSource ds;

	@Transactional
	@Override
	public Employee saveEmployee(Employee emp) {
		entityManager.persist(emp);
		return emp;

	}

	@Override
	public List<Employee> findAll() {
		CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Employee> query = cb.createQuery(Employee.class);
		Root<Employee> root = query.from(Employee.class);

		return this.entityManager.createQuery(query).getResultList();

	}

	@Override
	public Optional<Employee> findById(int id) {
		Employee employee = null;
		employee =this.entityManager.find(Employee.class, id);
		return Optional.fromNullable(employee);

	}

}
