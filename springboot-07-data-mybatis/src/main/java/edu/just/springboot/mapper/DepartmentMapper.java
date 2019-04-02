package edu.just.springboot.mapper;

import edu.just.springboot.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    List<Department> getDepts();

    Department getDeptById(Integer id);

    Integer addDept(Department department);

    Integer deleteDept(Integer id);

    Integer updateDept(Department department);

    List<Department> getDeptsByIds(Integer[] ids);

    List<Department> getDeptsByIdss(List<Integer> idsss);

    List<Department> getDeptsByIdsss(@Param("idss") Integer[] idss);

}
