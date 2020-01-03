package com.autowire.by.name.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeBean {

  private int employeeId;

  private String employeeName;

  @Autowired
  private DepartmentBean departmentBean1;

  public int getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  @Override
  public String toString() {
    return "EmployeeBean [employeeId=" + employeeId + ", employeeName=" + employeeName + ", departmentBean1="
        + departmentBean1 + "]";
  }

}
