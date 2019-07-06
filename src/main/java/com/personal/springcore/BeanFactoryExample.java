package com.personal.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.personal.springcore.bean.Employee;

public class BeanFactoryExample {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("beans-definition.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Object employeeObject = beanFactory.getBean("employee");
		if (employeeObject != null) {
			Employee employee = (Employee) employeeObject;
			System.out
					.println("First Name= " + employee.getFirstName() + "\t" + "Last Name= " + employee.getLastName());
		}

	}
}
