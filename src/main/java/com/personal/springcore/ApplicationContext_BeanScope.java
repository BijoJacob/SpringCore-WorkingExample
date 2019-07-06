package com.personal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.personal.springcore.bean.Employee;

public class ApplicationContext_BeanScope {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-definition-prototype.xml");
		Employee employee1 = applicationContext.getBean("employee",Employee.class);
		employee1.setFirstName("Bijo");
		employee1.setLastName("Jacob");
		System.out.println("Employee First Name="+employee1.getFirstName() + " Employee Last Name ="+employee1.getLastName());
		
		Employee employee2 = applicationContext.getBean(Employee.class);
		System.out.println("Employee First Name="+employee2.getFirstName() + " Employee Last Name ="+employee2.getLastName());

	
	}
}
