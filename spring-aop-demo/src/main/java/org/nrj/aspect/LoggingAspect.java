package org.nrj.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(public String org.nrj.model.Circle.getName())")
	public void LoggingAdviceOne() {
		System.out.println("Advice Running... Circle Get Method Called");
	}

	@Before("execution(public * get*())")
	public void LoggingAdviceTwo() {
		System.out.println("Advice Running... All Get Method Called");
	}
	
	@Before("execution(public String get*(..))") // .. is for any match of 0 or more args / * is for one or more args
	public void LoggingAdviceThree() {
		System.out.println("Advice Running... String Get Method Called");
	}
	
	@Before("execution(public String get*())")
	public void LoggingAdviceFour() {
		System.out.println("Advice Running... String Get Method Called");
	}
}
