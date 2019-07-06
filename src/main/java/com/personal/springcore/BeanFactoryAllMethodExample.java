package com.personal.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.personal.springcore.bean.Employee;

public class BeanFactoryAllMethodExample {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("beans-definition.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		System.out.println("Basic getBean()__________________________________");
		Employee employee1 = (Employee)beanFactory.getBean("employee");
		System.out.println("getBean() No casting needed__________________________________");
		Employee employee2 = beanFactory.getBean(Employee.class);
		System.out.println("getBean() No casting needed with more readble__________________________________");
		Employee employee3 = beanFactory.getBean("employee",Employee.class);
		
		//CHECK IF BEAN IS SINGLETON
		System.out.println("BEAN with id=employee IS SINGLETON= "+beanFactory.isSingleton("employee"));
		//CHECK THE CLASS TYPE OF THE BEAN
		Class<?> classType= beanFactory.getType("employee");
		System.out.println("ClassType ="+classType);
		
		
	}

}
