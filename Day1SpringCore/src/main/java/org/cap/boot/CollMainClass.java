package org.cap.boot;

import org.cap.model.CollectionDemo;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollMainClass {
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("collectionBean.xml");
		CollectionDemo cd=(CollectionDemo) context.getBean("myDemo");
		System.out.println(cd);
		context.close();
		
	}

}