package com.autowire.demo.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.autowire.by.type.field.demo.beans.EmployeeBean;

public class AutowireByTypeThroughFieldEx {

  public static void main(String[] args) {

    // For single context file we can pass directly like this
    ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
        "xml/appContextByTypeThroughField.xml");
    // For passing multiple context files we can pass the files inside the String
    // array like below
    // ApplicationContext appContext = new ClassPathXmlApplicationContext(new
    // String[] { "appContextByTypeThroughField.xml" });
    EmployeeBean employeeBean = (EmployeeBean) appContext.getBean("employeeBean");
    System.out.println(employeeBean);

    appContext.close();
  }
}
