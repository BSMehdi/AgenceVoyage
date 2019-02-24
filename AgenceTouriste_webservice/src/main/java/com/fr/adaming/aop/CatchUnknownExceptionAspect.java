package com.fr.adaming.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CatchUnknownExceptionAspect {
	
	private final Logger log = Logger.getLogger(CatchUnknownExceptionAspect.class);
	
	@Pointcut("execution(* com.fr.adaming.controller.UserRestController.readAll(..))")
	public void pc1() {};
	
	@Before("pc1()")
	public void beforeMethod() {

		System.out.println("**************************************************");
		System.out.println("****CatchUnknownExceptionAspect.aroundMethod()****");
		System.out.println("**************************************************");
	}
	
//	@Around("pc1()")
//	public Object aroundMethod(ProceedingJoinPoint jp) {
//
//		System.out.println("**************************************************");
//		System.out.println("****CatchUnknownExceptionAspect.aroundMethod()****");
//		System.out.println("**************************************************");
//		
//		try {
//			jp.proceed();
//		}catch(Throwable e){
//			System.out.println("!!!!!!!!!!!!!!!!!CatchUnknownExceptionAspect a détecté une exception inconnue!!!!!!!!!!!!!!!!!");
//			System.out.println("!!!!!!!!!!!!!!!!!CatchUnknownExceptionAspect a détecté une exception inconnue!!!!!!!!!!!!!!!!!");
//			System.out.println("!!!!!!!!!!!!!!!!!CatchUnknownExceptionAspect a détecté une exception inconnue!!!!!!!!!!!!!!!!!");
//			log.fatal("UNKNOWN EXCEPTION", e);
//			
//		}
//		
//		return null;
//	}

}
