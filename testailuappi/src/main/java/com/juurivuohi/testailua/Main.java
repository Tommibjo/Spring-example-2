package com.juurivuohi.testailua;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/juuriovuohi/pavut/Pavut.xml");
		Online online = (Online)context.getBean("online");
		System.out.println(online);
		((ClassPathXmlApplicationContext)context).close();
	}

}
