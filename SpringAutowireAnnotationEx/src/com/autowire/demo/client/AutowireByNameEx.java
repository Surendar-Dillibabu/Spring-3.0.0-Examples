package com.autowire.demo.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.autowire.by.name.demo.beans.EmployeeBean;

public class AutowireByNameEx {

  public static void main(String[] args) {

    // For single context file we can pass directly like this
    ApplicationContext appContext = new ClassPathXmlApplicationContext("xml/applicationContextByName.xml");
    // For passing multiple context files we can pass the files inside the String
    // array like below
    // ApplicationContext appContext = new ClassPathXmlApplicationContext(new
    // String[] { "applicationContextByName.xml" });
    EmployeeBean employeeBean = (EmployeeBean) appContext.getBean("employeeBean");
    System.out.println(employeeBean);s
  }
}
