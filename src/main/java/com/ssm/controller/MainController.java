package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssm.service.TestService;


/**
 * Created by XRog
 * On 2/1/2017.12:36 AM
 */
@Controller
public class MainController {
	@Autowired
	private TestService testService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(){
//        实际返回的是views/test.jsp ,spring-mvc.xml中配置过前后缀
        return "test";
    }
    
    @RequestMapping(value = "springtest", method = RequestMethod.GET)
    public String springTest(){
        return testService.test();
    }
}