package edu.just.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("edu.just.springboot.mapper")
public class Springboot07DataMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot07DataMybatisApplication.class, args);
    }

}


