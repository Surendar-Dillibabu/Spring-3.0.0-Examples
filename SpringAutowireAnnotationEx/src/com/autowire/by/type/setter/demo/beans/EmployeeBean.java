package com.autowire.by.type.setter.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * In this @Autowired annotation we are using setter injection. It will inject
 * default through byType. In case if we have more number of beans present for
 * the same type then it will check to solve the dependency through byName. Will
 * check whether any beans which has been present with the name provided in the
 * injected bean. Else will throw NoSuchBeanDefinitionException thrown.
 * 
 * To solve this we need to add @Qualifier annotation by passing the
 * corresponding bean name
 * 
 * @author Surendar
 *
 */
public class EmployeeBean {

  private int employeeId;

  private String employeeName;

  private DepartmentBean deptBean;

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

  public DepartmentBean getDeptBean() {
    return deptBean;
  }

  @Autowired
  @Qualifier("departmentBean1")
  public void setDeptBean(DepartmentBean deptBean) {
    this.deptBean = deptBean;
  }

  @Override
  public String toString() {
    return "EmployeeBean [employeeId=" + employeeId + ", employeeName=" + employeeName + ", deptBean=" + deptBean + "]";
  }

}
