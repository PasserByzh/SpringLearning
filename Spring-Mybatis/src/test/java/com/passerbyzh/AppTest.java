package com.passerbyzh;

import static org.junit.Assert.assertTrue;

import com.passerbyzh.dao.StudentDao;
import com.passerbyzh.domain.Student;
import com.passerbyzh.service.StudentService;
import com.passerbyzh.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test01()
    {
        String config = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName +"--" +context.getBean(beanDefinitionName));
        }

    }

    @Test
    public void test02()
    {
        String config = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        StudentService studentService = context.getBean("studentServiceImpl", StudentServiceImpl.class);
//        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//        Student student = Student.builder().id(2).age(90).email("lisi@gmail.com").name("lisi").build();
//        int i = studentService.addStudent(student);
        // Spring 和 mybatis 整合在一起使用，事务是自动提交的，无需执行SqlSession.commit();
//        System.out.println(i);
        List<Student> students = studentService.queryStudent();
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
