package edu.just.springboot.controller;

import edu.just.springboot.bean.Department;
import edu.just.springboot.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentMapper departmentMapper;

    @GetMapping("/get")
    public Department get(@RequestParam("id") Integer id) {
        return departmentMapper.getDeptById(id);
    }

    @PostMapping("/get2")
    public Department get2(@RequestParam("id") Integer id) {
        return departmentMapper.getDeptById(id);
    }

    @DeleteMapping("/get3")
    public Department get3(@RequestParam("id") Integer id) {
        return departmentMapper.getDeptById(id);
    }
}
