package org.example.demo2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/*
* @Aspect：是aspectj框架中的注解
* 作用：表示当前类是切面类
* 切面类：是用来给业务方法增加功能的类，在这个类中有切面的额功能代码
*
* */
@Aspect
public class MyAspect {

    /*
    * 定义方法，方法是实现切面功能的。
    * 方法的定义要求：
    * 1. 公共方法public
    * 2. 方法没有返回值
    * 3. 方法名称自定义
    * 4. 方法可以有参数，也可以没有参数
    *   如果有参数，参数不是自定义的，有几个参数类型可以使用
    * */

    /*
    * @Before：前置通知注解
    * 属性：value，是切入点表达式，表示切面的功能执行位置
    * 位置：在方法的上面
    * 特点：
    * 1. 在目标方法之前执行
    * 2. 不会改变目标方法的执行结果
    * 3. 不会影响目标方法的执行
    * */

    /**
     * 执行通知方法中的参数：JoinPoint
     * JointPoint：业务方法，需加入切面功能的业务方法
     *      作用是：可以在通知方法中获取方法执行的信息，例如方法名称，方法实参。
     *      如果你的切面功能中需要用到方法的信息，就加入JointPoint
     *      这个JointPoint 参数的值是由框架赋予的，必需是一个位置的参数
     *
     * */
    @Before(value = "execution(public * org.example.demo2.SomeServiceImpl.doSome(..))")
    public void myBefore(JoinPoint joinPoint){
        // 获取方法的完整定义
        System.out.println("方法的签名（定义）="+joinPoint.getSignature());
        System.out.println("方法的名称=" +joinPoint.getSignature().getName());
        //获取方法的实参
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println("参数："+arg);
        }
        System.out.println("切面功能，在目标方法之前输出执行时间："+ new Date());
    }



    /**
     * 后置通知定义方法，方法是实现切面的功能
     * 方法的定义需求：
     * 1. 公共方法public
     * 2. 方法没有返回值
     * 3. 方法名称自定义
     * 4. 方法有参数，推荐是Object，参数名自定义
     *
     * */

    /*
    * @AfterReturning：后置通知
    *   属性：1. value，切入点表达式
    *        2. returning 自定义的变量，表示目标方法的返回值的。
    *           自定义变量名必需和通知方法的形参名一样
    *   位置：在方法定义的上面
    *   特点；
    *       1. 在目标方法之后执行的
    *       2. 能够获取目标方法的返回值，可以根据这个返回值做不同的处理功能
    *       3. 可以修改返回值
    * */

    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))",returning = "res")
    public void myAfterReturning(Object res){
        // Object  res：是目标方法执行后的返回值，根据返回值做你的切面处理功能
        System.out.println("后置通知：在目标方法之后执行，获取的返回值时："+res);
    }
}
