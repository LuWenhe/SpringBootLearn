package edu.just.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Map;

@Component
//@Validated
public class Car {

    /**
     * <bean class="Person1">
     * <property name="name" value=""></property>
     * </bean>
     * <p>
     * value 中的值包括：字面量、从配置文件、Spel
     * <p>
     * 字面量：luwenhe、aaa
     * 配置文件：${person.name}、${person.age}
     */
//    @Email
    @Value("${car.name}")
    private String name;
    @Value("${car.length}")
    private Integer length;
    @Value("${car.weight}")
    private Integer weight;
    @Value("#{10*12}")
    private Integer aa;
//    @Value("${car.maps}")
    private Map<String, Integer> map;

    @Override

    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", weight=" + weight +
                ", aa=" + aa +
                '}';
    }
}
