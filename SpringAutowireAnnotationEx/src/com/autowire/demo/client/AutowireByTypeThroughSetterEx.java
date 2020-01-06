package com.autowire.demo.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.autowire.by.type.setter.demo.beans.EmployeeBean;

public class AutowireByTypeThroughSetterEx {

  public static void main(String[] args) {

    // For single context file we can pass directly like this
    ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
        "xml/appContextByTypeThroughSetter.xml");
    // For passing multiple context files we can pass the files inside the String
    // array like below
    // ApplicationContext appContext = new ClassPathXmlApplicationContext(new
    // String[] { "appContextByTypeThroughSetter.xml" });
    EmployeeBean employeeBean = (EmployeeBean) appContext.getBean("employeeBean");
    System.out.println(employeeBean);

    appContext.close();
  }
}
