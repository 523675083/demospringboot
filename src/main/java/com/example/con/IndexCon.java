package com.example.con;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexCon {

    @RequestMapping("/index2")
    public String index(){
        return "Hello world";
    }
}
