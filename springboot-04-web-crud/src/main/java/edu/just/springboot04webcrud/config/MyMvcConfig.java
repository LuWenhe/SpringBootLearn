package edu.just.springboot04webcrud.config;

import edu.just.springboot04webcrud.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

// 使用 WebMvcConfigurerAdapter 可以来扩展 SpringMVC 的功能
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 浏览器发送 /hello 请求到 success.html 页面
        registry.addViewController("/hello456").setViewName("success");
    }

    // 所以的 WebMvcConfigurerAdapter 组件都会一起起作用
    @Bean
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                /**
                 * 在视图解析器中添加解析的路径和视图的名称，下面的配置分别表示
                 * 去 localhost:8080/ 或者 localhost:8080/index.html 都会转发到 template 文件夹下的 index.html 页面
                 */
                registry.addViewController("/").setViewName("index");
                registry.addViewController("/index.html").setViewName("index");
                registry.addViewController("/main.html").setViewName("dashboard");
            }

            /**
             * 注册拦截器
             */
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                // 拦截所有地址，不包括 index.html、/ 和 /user/login
                // 静态资源不需要进行拦截，SpringBoot 已经做好了静态资源的映射
//                registry.addInterceptor(new LoginHandlerInterceptor())
//                        .addPathPatterns("/**")
//                        .excludePathPatterns("/index.html", "/", "/user/login", "/css/**", "/img/**", "/js/**");
            }
        };

        return adapter;
    }



    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }

}
