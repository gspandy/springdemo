package com.hll;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
    People peo = (People) context.getBean("peo");
    System.out.println(peo);
  }
}
