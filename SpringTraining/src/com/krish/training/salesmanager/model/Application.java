package com.krish.training.salesmanager.model;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.krish.training.salesmanager.config.ApplicationConfiguration;
import com.krish.training.salesmanager.repository.Employee;
import com.krish.training.salesmanager.service.EmployeeService;
import com.krish.training.salesmanager.service.EmployeeServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		List<Employee> employees= employeeService.getAllEmployees();

		for (Employee employee:employees){
			System.out.println(employee.getEmployeeName() +" at "+employee.getEmployeeLocation());

		}
	}

}
