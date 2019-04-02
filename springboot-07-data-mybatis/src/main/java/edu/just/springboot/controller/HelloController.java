package edu.just.springboot.controller;

import edu.just.springboot.bean.Employee;
import edu.just.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping("/emp")
    @ResponseBody
    public Employee insertEmp(Employee employee) {
        employeeMapper.insertEmp(employee);
        return employee;
    }

}
