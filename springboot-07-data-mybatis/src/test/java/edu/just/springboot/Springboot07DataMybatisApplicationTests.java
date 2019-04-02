package edu.just.springboot;

import edu.just.springboot.bean.Employee;
import edu.just.springboot.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot07DataMybatisApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    public void contextLoads() {
        System.out.println(employeeMapper.getAllEmp(1));
    }

    @Test
    public void getAllEmps() {
        List<Employee> allEmps = employeeMapper.getAllEmps();
        System.out.println(allEmps);
    }

    @Test
    public void insertEmp() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setLastName("luwenhe");
        employee.setEmail("luwenhe@123.com");
        employee.setGender(1);
        employee.setDeptId(1);
        int i = employeeMapper.insertEmp(employee);
        System.out.println(i);
    }

    @Test
    public void updateEmployee() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setLastName("xixixi");
        int i = employeeMapper.updateEmpById(employee);
        System.out.println(i);
    }

    @Test
    public void deleteAll() {
        int i = employeeMapper.deleteEmps();
        System.out.println(i);
    }

}
