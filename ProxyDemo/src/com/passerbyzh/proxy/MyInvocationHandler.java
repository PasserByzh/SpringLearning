package com.passerbyzh.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MyInvocationHandler implements InvocationHandler {
    // 目标对象
    private Object target;// SomeServiceImpl

    public MyInvocationHandler(Object object) {
        this.target = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 通过代理对象执行方法时，会调用执行这个invoke()
        System.out.println("方法之前执行..."+method.getName()+" ：传递的参数..."+ Arrays.toString(args));
        // 被增强的方法执行
        Object res = method.invoke(target, args);
        // 方法之后
        System.out.println("方法之后执行..."+target);
        return res;
    }
}
