package com.passerbyzh;

import com.passerbyzh.service.SomeService;
import com.passerbyzh.service.impl.SomeServiceImpl;

public class MyApp {
    public static void main(String[] args) {
        SomeService service = new SomeServiceImpl();
        service.doSomething1();
        System.out.println("===========================");
        service.doSomething2();
    }
}
