package org.example;

import static org.junit.Assert.assertTrue;

import org.example.service.SomeService;
import org.example.service.impl.SomeServiceImpl;
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

}
