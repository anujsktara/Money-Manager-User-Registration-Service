package com.ce.ur.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ce.ur.RegserviceApplication;

@Aspect
@Component
public class completelog {
	private static final Logger LOGGER = LoggerFactory.getLogger(completelog.class);
	@Pointcut("@annotation(log)")
	private void selectall() {}
	@Around("selectall()")
	public void aroundadvice(ProceedingJoinPoint jp)
	{   System.out.println("in the advice");
		String methodname = jp.getSignature().getName();
		String classname = jp.getClass().getName();
		LOGGER.info("executing in class "+classname+" method: "+methodname);
	}
}
