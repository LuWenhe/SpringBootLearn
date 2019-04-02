package edu.just.springboot04webcrud.controller;

import edu.just.springboot04webcrud.dao.DepartmentDao;
import edu.just.springboot04webcrud.dao.EmployeeDao;
import edu.just.springboot04webcrud.model.Department;
import edu.just.springboot04webcrud.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    // 查询方法以 GET 方式进行请求
    @GetMapping("/emps")
    public String list(Model model) {
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("employees", employees);
        // 到 list.html
        return "list";
    }

    // 以 GET 方式来到修改页面
    @GetMapping("/emp")
    public String toAddPage(Model model) {
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments", departments);
        // 到 add.html
        return "add";
    }

    // 添加方法以 POST 方式进行请求
    @PostMapping("/emp")
    public String addEmp(Employee employee) {
        employeeDao.save(employee);
        // 重定向到 emps 请求
        return "redirect:/emps";
    }

    // 来到修改页面
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id,
                             Model model) {
        Employee employee = employeeDao.get(id);
        Collection<Department> departments = departmentDao.getDepartments();

        model.addAttribute("empt", employeeDao);
        model.addAttribute("departments", employeeDao);
        return "add";
    }

}
