package org.example.service.impl;

import org.example.service.SomeService;

public class SomeServiceImpl implements SomeService {

    public SomeServiceImpl() {
        System.out.println("执行SomeServiceImpl 构造方法");
    }

    @Override
    public void doSome() {
        System.out.println("执行了SomeServiceImpl 的 doSome()方法！");
    }
}
