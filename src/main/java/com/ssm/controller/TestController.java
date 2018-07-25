package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.entity.Person;
import com.ssm.service.PersonService;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "mybatis")
    public @ResponseBody String mybatis(){
        Person person = new Person();
        person.setUsername("test2");
        person.setPassword("123");
        personService.insert(person);
        return "success";
    }
}
