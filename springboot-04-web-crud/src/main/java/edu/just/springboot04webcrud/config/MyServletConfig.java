package edu.just.springboot04webcrud.config;

import edu.just.filter.MyFilter;
import edu.just.listener.MyListener;
import edu.just.springboot04webcrud.servlet.MyServlet;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Servlet;
import java.util.Arrays;
import java.util.Collection;

/**
 * Spring 配置类
 */
@Configuration
public class MyServletConfig {

    // 注册自己创建的 MyServlet
    @Bean
    public ServletRegistrationBean myServlet() {
        MyServlet myServlet = new MyServlet();
        // 映射的路径
        String urlMappings = "/myServlet";

        ServletRegistrationBean<Servlet> registrationBean
                = new ServletRegistrationBean<>(myServlet, urlMappings);
        return registrationBean;
    }

    // 注册自己创建的 MyFilter
    @Bean
    public FilterRegistrationBean myFilter() {
        MyFilter myFilter = new MyFilter();
        Collection<String> urlPatterns = Arrays.asList("/hello", "/myServlet");

        FilterRegistrationBean<MyFilter> filterRegistrationBean
                = new FilterRegistrationBean<>();
        // 设置 Filter
        filterRegistrationBean.setFilter(myFilter);
        // 设置拦截的路径
        filterRegistrationBean.setUrlPatterns(urlPatterns);

        return filterRegistrationBean;
    }

    // 注册自己创建的 MyListener
    @Bean
    public ServletListenerRegistrationBean myListener() {
        MyListener myListener = new MyListener();
        ServletListenerRegistrationBean<MyListener> listenerRegistrationBean
                = new ServletListenerRegistrationBean<>(myListener);
        return listenerRegistrationBean;
    }

    // 配置嵌入式的 Servlet 容器的属性
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            //定制嵌入式的 Servlet 容器的相关规则
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
//                factory.setPort(8089);
            }
        };
    }

}
