package edu.just.springboot04webcrud.controller;

import edu.just.springboot04webcrud.exception.UserNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
public class HelloController {

    /*@RequestMapping({"/", "index.html"})
    public String index() {
        return "index";
    }*/

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/hello1")
    public String success(Model model) {
        model.addAttribute("name", "luwenhe");
        // 去 classpath:/templates 路径下寻找 success.html 页面
        return "success";
    }

    @RequestMapping("/hello2")
    public String success2(Model model) {
        model.addAttribute("hello", "<h3>你好</h3>");
        model.addAttribute("users", Arrays.asList("AAA", "BBB", "CCC"));
        return "success2";
    }

    @ResponseBody
    @RequestMapping("/user")
    public String hello(String name) {
        if (name.equals("aaa")) {
            throw new UserNotFoundException();
        }
        return "hello world";
    }

}
