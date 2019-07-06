package com.personal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.personal.springcore.bean.Employee;

public class ApplicationContext_ClassPathAppContext {

	public static void main(String[] args) {
		ApplicationContext appContext = null;
		try {
			appContext = new ClassPathXmlApplicationContext("beans-definition.xml");
			Employee employee = appContext.getBean("employee",Employee.class);
			System.out.println("Employee First Name = "+employee.getFirstName());
			System.out.println("Employee Last  Name = "+employee.getLastName());

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			((AbstractApplicationContext)appContext).close();
		}
	}
	
}
