package edu.just.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration: 指名当前类是一个配置类，替代 Spring 的 xml 配置文件
 *
 * 如果在 xml 配置文件中，使用 <bean></bean> 标签的方法添加组件
 */
@Configuration
public class MyApplicationConfig {

    /**
     * 将方法的返回值添加到容器中，该组件的默认 id 就是方法名字
     * 将 HelloService 组件添加到容器中，id 就是 helloService
     */
    @Bean
    public String helloService() {
        System.out.println("helloService组件");
        return "hello world";
    }

}
