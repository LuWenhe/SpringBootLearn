package edu.just.springboot05webjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/helloController")
    public String hello(Model model) {
        model.addAttribute("name", "aaa");
        model.addAttribute("age", "10");
        return "success";
    }

}
