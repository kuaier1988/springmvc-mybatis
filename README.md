# springmvc-mybatis
搭建spring、springmvc、mybatis框架
# 加入了spring aop的内容
1、com.ssm.aspect.SystemLogAspect里的拦截是全局拦截，@Pointcut("execution (* com.ssm.controller..*.*(..))")
	public void controllerAspect() {}即只要在com.ssm.controller下的所有类都被拦截，在controller的类里要加入@Log，如调用方法看com.ssm.controller.TestController的mybatis()方法<br/>
2、com.ssm.aspect.UserAccessAspect的@Pointcut(value="@annotation(com.ssm.annotation.UserAccess)")
	public void access() {}只拦截@UserAccess注解，具体用法详见com.ssm.controller.TestController的testUserAccessAspect()方法
