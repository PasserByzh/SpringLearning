package org.example;

import static org.junit.Assert.assertTrue;

import org.example.service.SomeService;
import org.example.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void myTest(){
//        SomeService service = new SomeServiceImpl();
//        service.doSome();

        /*
        * Spring 默认创建对象的时间：在创建Spring容器的时候，会创建配置文件中的所有对象。
        * Spring 创建对象，默认调用的是无参数构造方法
        * */
        // 1. 指定Spring配置文件的名称
        String config = "beans.xml";
        // 2. 创建表示Spring容器的对象，ApplicationContext
        // ApplicationContext 表示Spring容器，通过容器就能获取对象
        // ClassPathXmlApplicationContext：表示从类路径中加载Spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        // 从容器中获取某个对象，调用对象的方法
        SomeService someService = (SomeService) context.getBean("SomeService");
        // 使用Spring创建好的对象
        someService.doSome();
    }

    /** 获取Spring容器中 Java对象的信息 */
    @Test
    public void getBeansInfoInSping(){
        String config = "beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        // 使用Spring提供的方法，获取容器中定义的对象的数量
        int nums = context.getBeanDefinitionCount();
        System.out.println(nums);
        // 获取定义的对象的名称
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    /** 获取一个非自定义类的对象*/
    @Test
    public void getNonCustomObj(){
        String config = "beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        Date date = context.getBean("myDate",Date.class);
        System.out.println("Date: "+date);
    }


}
