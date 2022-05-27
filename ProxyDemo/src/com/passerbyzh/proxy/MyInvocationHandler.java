package com.passerbyzh.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    // 目标对象
    private Object target;// SomeServiceImpl

    public MyInvocationHandler(Object object) {
        this.target = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 通过代理对象执行方法时，会调用执行这个invoke()
        method.invoke(target,args);
        return null;
    }
}
