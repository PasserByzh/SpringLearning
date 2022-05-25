package org.example;

import org.example.demo04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest04
{
    @Test
    public void test(){
        String config = "demo04/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        Student student = context.getBean("Student", Student.class);
//        System.out.println("Student 对象:"+student.toString());

        Student student1 = context.getBean("Student1",Student.class);
        System.out.println(student1.toString());
    }
}
