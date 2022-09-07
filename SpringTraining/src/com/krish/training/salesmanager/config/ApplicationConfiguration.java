package com.krish.training.salesmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.krish.training.salesmanager.repository.EmployeeRepository;
import com.krish.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.krish.training.salesmanager.service.EmployeeService;
import com.krish.training.salesmanager.service.EmployeeServiceImpl;

@Configuration
@ComponentScan("com.krish")
public class ApplicationConfiguration {
	
	@Bean(name = "employeeService")
	@Scope("singleton")
	public EmployeeService getEmployeeService() {
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		return employeeService;
	}
	
//	@Bean(name = "employeeRepository")
//	public EmployeeRepository getEmployeeRepository() {
//		return new HibernateEmployeeRepositoryImpl();
//	}

}
