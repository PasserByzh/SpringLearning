package com.passerbyzh.service.impl;

import com.passerbyzh.service.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSomething1() {
        System.out.println("SomeServiceImpl doSomething1");
    }

    @Override
    public void doSomething2() {
        System.out.println("SomeServiceImpl doSomething2");
    }
}
