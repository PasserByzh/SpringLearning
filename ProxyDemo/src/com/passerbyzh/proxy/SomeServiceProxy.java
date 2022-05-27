package com.passerbyzh.proxy;

import com.passerbyzh.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class SomeServiceProxy extends Proxy {

    private Object someServiceImpl;



    /**
     * Constructs a new {@code Proxy} instance from a subclass
     * (typically, a dynamic proxy class) with the specified value
     * for its invocation handler.
     *
     * @param h the invocation handler for this proxy instance
     * @throws NullPointerException if the given invocation handler, {@code h},
     *                              is {@code null}.
     */
    protected SomeServiceProxy(InvocationHandler h) {
        super(h);
    }






}
