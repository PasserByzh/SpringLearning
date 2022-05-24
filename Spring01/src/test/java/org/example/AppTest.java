package org.example;

import static org.junit.Assert.assertTrue;

import org.example.service.SomeService;
import org.example.service.impl.SomeServiceImpl;
import org.junit.Test;

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
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }

}
