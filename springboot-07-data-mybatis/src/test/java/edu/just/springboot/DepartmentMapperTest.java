package edu.just.springboot;

import edu.just.springboot.bean.Department;
import edu.just.springboot.mapper.DepartmentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentMapperTest {

    @Autowired
    DepartmentMapper departmentMapper;

    @Test
    public void test1() {
        Department deptById = departmentMapper.getDeptById(1);
        System.out.println(deptById);
    }

    @Test
    public void test2() {
        List<Department> a = departmentMapper.getDepts();
        System.out.println(a);
    }

    @Test
    public void test3() {
        Department department = new Department();
        department.setId(100);
        department.setDepartName("xixixi");
        departmentMapper.addDept(department);
    }

    @Test
    public void test4() {
        Integer integer = departmentMapper.deleteDept(100);
        System.out.println(integer);
    }

    @Test
    public void test5() {
        Department department = new Department();
        department.setId(1);
        department.setDepartName("qwer");
        Integer integer = departmentMapper.updateDept(department);
        System.out.println(integer);
    }

    @Test
    public void test6() {
        Integer[] ids = {1, 2, 3, 4, 5};
        List<Department> deptsByIds = departmentMapper.getDeptsByIds(ids);
        System.out.println(deptsByIds);
    }

    @Test
    public void test7() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        List<Department> deptsByIdss = departmentMapper.getDeptsByIdss(list);
        System.out.println(deptsByIdss);
    }

    @Test
    public void test8() {
        Integer[] ids = {1, 2, 3, 4, 5};
        List<Department> deptsByIdsss = departmentMapper.getDeptsByIdsss(ids);
        System.out.println(deptsByIdsss);
    }
}
