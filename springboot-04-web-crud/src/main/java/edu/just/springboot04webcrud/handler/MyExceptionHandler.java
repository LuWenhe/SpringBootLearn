package edu.just.springboot04webcrud.handler;

import edu.just.springboot04webcrud.exception.UserNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

    /**
     * 1.浏览器和客户端返回的都是 json 格式的数据
     */
    /*@ResponseBody
    @ExceptionHandler(UserNotFoundException.class)
    public Map<String, Object> handleException(Exception e) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", "user not exists");
        map.put("message", e.getMessage());
        return map;
    }*/

    /**
     * 2.将错误信息转发到系统的 /error 请求，该请求能对浏览器和客户端传来的错误进行不同的处理
     *   但是错误的几个参数依然是系统提供的，并不是我们自己设置的参数
     */
    @ExceptionHandler(UserNotFoundException.class)
    public String handleException2(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        /**
         * 传入我们自己的错误状态码, 如 4xx、5xx, 否则错误的页面依然是 SpringBoot 默认提供的错误页面,
         * 同时也不会进入到定制错误页面的解析流程
         *
         * 后台定制错误页面的关机代码，即从 request 中获取
         * Integer statusCode = (Integer) request
         * 			.getAttribute("javax.servlet.error.status_code");
         */
        // 向 request 中传入参数
        request.setAttribute("javax.servlet.error.status_code", 500);
        map.put("code", "user not exists");
        map.put("message", e.getMessage());
        return "forward:/error";
    }



}
