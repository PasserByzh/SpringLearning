package org.example;

import static org.junit.Assert.assertTrue;

import org.example.demo01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test(){
        String config = "demo01/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        Student student = context.getBean("Student", Student.class);
        System.out.println("Student 对象:"+student.toString());
    }
}
