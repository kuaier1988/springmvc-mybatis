package com.ssm.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.ssm.annotation.UserAccess;

@Component
@Aspect
public class UserAccessAspect {
	
	@Pointcut(value="@annotation(com.ssm.annotation.UserAccess)")
	public void access() {
		
	}
	
	@Before("access()")
	public void doBefore(JoinPoint joinPoint) throws Throwable {
		System.out.println("second before");
	}
	
	@Around("@annotation(userAccess)")
	public Object around(ProceedingJoinPoint pjp,UserAccess userAccess) {
		//获取注解里的值
		System.out.println("second around:"+userAccess.desc());
		try {
			return pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
			return null;
		}
	}
	

}
