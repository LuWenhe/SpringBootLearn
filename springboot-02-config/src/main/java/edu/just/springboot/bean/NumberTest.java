package edu.just.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "number")
public class NumberTest {

    private String n1;
    private long n2;
    private int n3;
    private String n4;
    private String n5;
    private String n6;
    private String n7;

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public long getN2() {
        return n2;
    }

    public void setN2(long n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public String getN4() {
        return n4;
    }

    public void setN4(String n4) {
        this.n4 = n4;
    }

    public void setN5(String n5) {
        this.n5 = n5;
    }

    public String getN5() {
        return n5;
    }

    public void setN6(String n6) {
        this.n6 = n6;
    }

    public String getN6() {
        return n6;
    }

    public void setN7(String n7) {
        this.n7 = n7;
    }

    public String getN7() {
        return n7;
    }

    @Override
    public String toString() {
        return "NumberTest{" +
                "n1='" + n1 + '\'' +
                ", n2=" + n2 +
                ", n3=" + n3 +
                ", n4='" + n4 + '\'' +
                ", n5='" + n5 + '\'' +
                ", n6='" + n6 + '\'' +
                ", n7='" + n7 + '\'' +
                '}';
    }
}
