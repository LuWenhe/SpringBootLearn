package edu.just.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件 application.yml 中配置的每一个属性的值，映射到这个组件 Person 中
 *
 * @ConfigurationProperties: 将 JavaBean 中的属性与 yml 配置文件中对应的属性进行绑定
 *                           默认从全局配置文件 application.properties 中获取值
 *
 * prefix = "person": 将 JavaBean 与 yml 配置文件下的 person 属性进行映射
 *
 * 需要将 JavaBean 添加组件注解
 */
@Component
@ConfigurationProperties(prefix = "person")     // 对应配置文件的前缀
@Validated
public class Person {

//    @Email  //对 lastName 属性进行邮箱格式的校验
    private String lastName;
    private Integer age;
    private Boolean boss;
    private Date birth;

    private Map<String, String> maps;
    private List<String> lists;
    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public List<String> getLists() {
        return lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

}
