package edu.just.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JdbcController {

    @RequestMapping("/hello")
    public String hello() {
        return "nihao";
    }

    @RequestMapping("/hello2")
    @ResponseBody
    public String hello2() {
        return "hello2";
    }

}
