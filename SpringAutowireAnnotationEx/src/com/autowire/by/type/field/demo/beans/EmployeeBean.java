package com.autowire.by.type.field.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * In this @Autowired annotation we are using field injection. It will inject
 * default byType. In case if we have more number of beans present for the same
 * type then it will check to solve the dependency through byName. Will check
 * whether any beans which has been present with the name provided in the
 * injected bean. Else will throw NoSuchBeanDefinitionException thrown.
 * 
 * To solve this we need to add @Qualifier annotation by passing the
 * corresponding bean name
 * 
 * If no bean is there then the default @Autowired annotation will throw exception. Since the default value for attribute is true.
 * If we want to avoid throwing error then we can pass the required attriute value as false as like below.
 * Then if no bean able to inject then it won't throw any error
 * @Autowired(required=false)
 * @author Surendar
 *
 */
public class EmployeeBean {

  private int employeeId;

  private String employeeName;

  @Autowired
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

  @Override
  public String toString() {
    return "EmployeeBean [employeeId=" + employeeId + ", employeeName=" + employeeName + ", deptBean=" + deptBean + "]";
  }

}
