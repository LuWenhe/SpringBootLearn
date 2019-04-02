package edu.just.springboot04webcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    // @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    // 可以直接使用 @PostMapping 来替代 @RequestMapping
    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model,
                        HttpSession httpSession) {
        // 如何用户名不为空且密码等于123456
        if (!StringUtils.isEmpty(username) && password.equals("123456")) {
            httpSession.setAttribute("loginUser", username);
            // 登陆成功, 并重定向到 main.html，该页面会自动转发到 dashboard.html
            return "redirect:/main.html";
        } else {
            // 登陆失败
            model.addAttribute("msg", "用户名或者密码错误");
            return "index";
        }
    }

}
