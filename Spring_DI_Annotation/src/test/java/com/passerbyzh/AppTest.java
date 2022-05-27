package com.passerbyzh;

import static org.junit.Assert.assertTrue;

import com.passerbyzh.demo6.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
//    @Test
//    public void test01(){
//        String config = "applicationContext.xml";
//        ApplicationContext context = new ClassPathXmlApplicationContext(config);
//        Student student = context.getBean("myStudent",Student.class);
//        Student student1 = context.getBean("student",Student.class);
//        System.out.println(student.toString());
//    }

//    @Test
//    public void test02(){
//        String config = "applicationContext.xml";
//        ApplicationContext context = new ClassPathXmlApplicationContext(config);
//        Student student = context.getBean("myStudent",Student.class);
//        System.out.println(student.toString());
//    }

//    @Test
//    public void test03(){
//        String config = "applicationContext.xml";
//        ApplicationContext context = new ClassPathXmlApplicationContext(config);
//        Student student = context.getBean("myStudent",Student.class);
//        System.out.println(student);
//
//    }

    @Test
    public void test03(){
        String config = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        Student student = context.getBean("myStudent",Student.class);
        System.out.println(student);

    }
}
