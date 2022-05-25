package org.example;

import org.example.demo03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest03
{
    @Test
    public void test(){
        String config = "demo03/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        Student student = context.getBean("Student", Student.class);
        System.out.println("Student 对象:"+student.toString());
    }
}
