package edu.just.springboot04webcrud.component;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 添加拦截器，对登陆进行拦截
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

    // 目标方法执行之前进行拦截判断
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("loginUser");
        if (user == null) {
            // 未登陆, 转发到 index.html
            request.setAttribute("msg", "没有权限");
            request.getRequestDispatcher("/index.html").forward(request, response);
            return false;
        } else {
            // 已登陆
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

}
