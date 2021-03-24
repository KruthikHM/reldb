package com.whizdm.demo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Employees {

    private String employeename;
    private String employeeemail;
    private String employeepassword;
    private Long pod_id;
    private Long emp_id;
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setEmp_id(Long emp_id) {
        this.emp_id = emp_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getEmp_id() {
        return emp_id;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmployeeemail() {
        return employeeemail;
    }

    public void setEmployeeemail(String employeeemail) {
        this.employeeemail = employeeemail;
    }

    public String getEmployeepassword() {
        return employeepassword;
    }

    public void setEmployeepassword(String employeepassword) {
        this.employeepassword = employeepassword;
    }

    public Long getPod_id() {
        return pod_id;
    }

    public void setPod_id(Long pod_id) {
        this.pod_id = pod_id;
    }
}
