package com.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

		Car bean = (Car) context.getBean("car");
		System.out.println(bean.display());
	}
}
