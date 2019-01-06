package edu.just.springboot;

import edu.just.springboot.bean.Car;
import edu.just.springboot.bean.People;
import edu.just.springboot.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot单元测试
 *
 * 可以在测试期间进行自动注入
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02ConfigApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    private Car car;

    @Autowired
    private People people;

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void test() {
        System.out.println(person);
    }

    @Test
    public void test1() {
        System.out.println(car);
    }

    @Test
    public void test2() {
        System.out.println(people);
    }

    @Test
    public void test3() {
        // 判断 IOC 容器中是否包含名为 helloService 的 Bean
        boolean helloService = applicationContext.containsBean("helloService");
        System.out.println(helloService);
    }

}

