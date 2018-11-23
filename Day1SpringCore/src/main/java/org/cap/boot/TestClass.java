package org.cap.boot;

import org.cap.model.Employee;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		//ApplicationContext context=
		AbstractApplicationContext context=
					//new FileSystemXmlApplicationContext("C:\\Users\\vidavid\\Desktop\\myBeans.xml");
					new ClassPathXmlApplicationContext("myBeans.xml");
		
		//one request
		Employee employee=(Employee) context.getBean("emp");
		
		//another request
		//Employee employee1=(Employee) context.getBean("emp");
		
		employee.setEmployeeName("JAckson");
		
		
		System.out.println(employee);
		//System.out.println(employee1);
		
		context.registerShutdownHook();
		//context.close();

	}

}
