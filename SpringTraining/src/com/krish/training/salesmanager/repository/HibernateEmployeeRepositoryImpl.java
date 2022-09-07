package com.krish.training.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("employeeRepImpl")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	public List<Employee> getAllEmployees () {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee employee = new Employee();
		employee.setEmployeeName("Vihanga");
		employee.setEmployeeLocation("Maharagama");
		employees.add(employee);
		return employees;
		
	}

}
