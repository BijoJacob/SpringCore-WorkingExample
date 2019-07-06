package com.personal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.personal.springcore.bean.Chapters;
import com.personal.springcore.bean.Department;

public class ApplicationContext_Annotation {
	public static void main(String[] args) {
		ApplicationContext appContext = null;
		try {
			appContext = new ClassPathXmlApplicationContext("beans-definition-with-annotation.xml");
			Department department1 = appContext.getBean("department", Department.class);
			department1.setDepartmentId(1l);
			department1.setDepartmentName("DIR-SF");
			
			System.out.println("Department Id= "   +  department1.getDepartmentId());
			System.out.println("Department Name= " +  department1.getDepartmentName());
			
			Department department2 = appContext.getBean("department", Department.class);
			department2.setDepartmentId(1l);
			department2.setDepartmentName("DIR-SF");
			
			System.out.println("Department Id= "   +  department2.getDepartmentId());
			System.out.println("Department Name= " +  department2.getDepartmentName());

			Chapters chapter1 = appContext.getBean("chapters",Chapters.class);
			chapter1.setChapterId(1l);
			chapter1.setChapterName("BACK-END");
			
			Chapters chapter2 = appContext.getBean("chapters",Chapters.class);
			System.out.println("CHECKING THE WORKING OF SCOPE = Prototype");
			System.out.println(chapter1.getChapterName());
			System.out.println(chapter2.getChapterName());
			

		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			((AbstractApplicationContext) appContext).close();
		}

	}
}
