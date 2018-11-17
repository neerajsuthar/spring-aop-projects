package org.nrj;

import org.nrj.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopDemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx  =  new ClassPathXmlApplicationContext("spring.xml");
		
		ShapeService s = ctx.getBean("shape", ShapeService.class);
		
		System.out.println(s.getCircle().getName());
		System.out.println(s.getTriangle().getName());

	}
}
