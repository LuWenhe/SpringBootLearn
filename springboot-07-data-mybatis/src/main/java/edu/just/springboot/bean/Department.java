package edu.just.springboot.bean;

public class Department {

    private Integer id;
    private String departName;

    public Department() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    @Override
    public String toString() {
        return "DepartmentMapper{" +
                "id=" + id +
                ", departName='" + departName + '\'' +
                '}';
    }

}
