package com.passerbyzh.proxy;

import com.passerbyzh.service.SomeService;
import com.passerbyzh.service.impl.SomeServiceImpl;

import java.lang.reflect.Proxy;

public class JDKProxy {
    public static void main(String[] args) {
        SomeServiceImpl service = new SomeServiceImpl();
        Class[] interfacces = {SomeService.class};
        SomeService someService = (SomeService) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),interfacces,new MyInvocationHandler(service));
        someService.doSomething1(99);

    }
}
