package edu.just.springboot.mapper;

import edu.just.springboot.bean.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Select("select id, last_name lastName, gender, email, dept_id deptId from employee")
    List<Employee> getAllEmps();

    @Select("select id, last_name lastName, gender, email, dept_id deptId from employee where id = #{empId}")
    Employee getAllEmp(Integer empId);

    @Delete("delete from employee where id = #{empId}")
    int deleteEmplById(Integer empId);

    @Delete("delete from employee")
    int deleteEmps();

    @Update("update employee set last_name = #{lastName} where id = #{id}")
    int updateEmpById(Employee employee);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into employee(id, last_name, gender, email, dept_id) values(#{id}, #{lastName}, #{gender}, #{email}, #{deptId})")
    int insertEmp(Employee employee);

}
