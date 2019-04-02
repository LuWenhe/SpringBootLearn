package edu.just.springboot04webcrud;

import edu.just.springboot04webcrud.dao.EmployeeDao;
import edu.just.springboot04webcrud.model.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot04WebCrudApplicationTests {

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void contextLoads() {
        Collection<Employee> all = employeeDao.getAll();
        System.out.println(all);
    }

}

