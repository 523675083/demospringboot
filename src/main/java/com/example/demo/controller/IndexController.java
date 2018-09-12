package com.example.demo.controller;

import com.example.demo.BookBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private BookBean bookBean;

    @RequestMapping(value = "/index")
    public Map<String,Object> index(){
        Map<String ,Object> map=new HashMap<>();
        map.put("张三",18);
        map.put("李四",28);
        return map;
    }

    @RequestMapping(value = "/getBook",produces = "text/plain;charset=UTF-8")
    public String getBook(){
        logger.info("=====================");
        return "Hello Spring Boot! The BookName is "+bookBean.getName()+";and Book Author is "+bookBean.getAuthor()+";and Book PinYin is "+bookBean.getPrice();
    }
}
