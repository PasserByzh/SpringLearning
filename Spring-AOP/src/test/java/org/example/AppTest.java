package org.example;

import static org.junit.Assert.assertTrue;

import org.example.demo3.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        SomeService proxy = context.getBean("someServiceImpl", SomeService.class);
        String passerByzh = proxy.doAround("PasserByzh", 99);
        System.out.println("执行结果："+passerByzh);
    }
}
