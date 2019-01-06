package edu.just.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ImportResource: 导入 Spring 的配置文件
 */
//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class Springboot02ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot02ConfigApplication.class, args);
    }

}

