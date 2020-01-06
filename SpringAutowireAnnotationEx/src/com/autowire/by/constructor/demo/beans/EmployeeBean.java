package com.autowire.by.constructor.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * In this @Autowired annotation we are using constructor injection. It will
 * inject default through byType. In case if we have more number of beans
 * present for the same type then it will check to solve the dependency through
 * byName. Will check whether any beans which has been present with the name
 * provided in the injected bean. Else will throw NoSuchBeanDefinitionException
 * thrown.
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

  /*
   * Here @Qualifier annotation not allowed in constructor. It will be allowed in Field, Method, Parameter, TYPE or ANNOTATION_TYPE
   * So, we are passing the @Qualifier annotation inside parameter
   */
  @Autowired
  public EmployeeBean(@Qualifier("departmentBean1") DepartmentBean deptBean) {
    this.deptBean = deptBean;
  }

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
    return "EmployeeBean [employeeId=" + employeeId + ", employeeName=" + employeeName + ", deptBean=" + deptBean + "]";
  }

}
