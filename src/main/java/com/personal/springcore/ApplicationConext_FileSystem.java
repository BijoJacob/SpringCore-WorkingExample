package com.personal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.personal.springcore.bean.Employee;

public class ApplicationConext_FileSystem {

	public static void main(String[] args) {
		ApplicationContext applicationContext = null;
		try {
			applicationContext  = new FileSystemXmlApplicationContext("src\\main\\resources\\beans-definition.xml");
			Employee employee = applicationContext.getBean("employee",Employee.class);
			System.out.println("Employee FIRST NAME ="+employee.getFirstName());
			System.out.println("Employee LAST NAME  ="+employee.getLastName());
		}catch(Exception exception) {
			System.out.println(exception.getMessage());
		}finally{
			((AbstractApplicationContext)applicationContext).close();
		}
		
	}
	
}
