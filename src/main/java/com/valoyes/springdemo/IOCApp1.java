package com.valoyes.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApp1 {

	public static void main(String[] args) {
		
		// 1. creamos el aplication-context (container)
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		// 2. creamos el bean
		Organization org = (Organization) ctx.getBean("myorg");
		
		// 3. invoke the company slogan via de bean
		org.comporateSlogan();
		
		// 4. cerramos el application conxtext (container)
		((FileSystemXmlApplicationContext) ctx).close();
	}

}
