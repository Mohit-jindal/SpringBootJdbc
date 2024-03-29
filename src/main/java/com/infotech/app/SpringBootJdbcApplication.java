package com.infotech.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infotech.app.dao.EmployeeDAO;
import com.infotech.app.model.Employee;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//createEmployee();
		//getEmployeeById();
		//employeeDAO.updateEmployeeEmailById(1, "update@gmail.com");
		employeeDAO.deleteEmployeeById(1);
	}

	private void getEmployeeById()
	{
		Employee employee = employeeDAO.getEmployeeById(1);
		System.out.println(employee);
	}
	
	private void createEmployee()
	{
		Employee employee = new Employee();
		employee.setEmployeeName("Kishan");
		employee.setEmail("kisan.s@gmail.com");
		employee.setSalary(90000.00);
		
		employeeDAO.createEmployee(employee);
	}
}
