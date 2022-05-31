package org.example.demo3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

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
    @Before(value = "execution(public * org.example.demo3.SomeServiceImpl.doSome(..))")
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


    /**环绕通知方法的定义格式
     * 1.public
     * 2. 必需有一个返回值，推荐使用Object
     * 3. 方法名称自定义
     * 4. 方法有参数 固定参数 ProceedingJoinPoint
     * */
    /**
     * @Around 环绕通知
     *  属性：value，切入点表达式
     *  位置：在方法的定义上面
     *特点：
     * 1. 它是功能最强的通知
     * 2. 在目标方法的前后都能增强功能
     * 3. 控制目标方法是否被调用执行
     * 4. 修改原来的目标方法的执行结果，影响最后的调用结果
     *
     * 环绕通知，等同于jdk动态代理的，InvocationHandler接口
     *
     * 参数ProceedingJoinPoint等同于JDK动态代理的Method
     *      作用：执行目标方法的
     * 返回值：就是目标方法的执行结果，可以被修改
     *
     *
     * 环绕通知：经常做事务，在目标方法之前开启事务，执行目标方法，在目标方法之后提交事务。
     * */
    @Around(value = "execution(* *..SomeServiceImpl.doAround(..))")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // 环绕通知
        Object result = null;
        System.out.println("环绕通知：在目标方法执行之前，输出实现："+new Date());
        //1. 目标方法调用
        result = proceedingJoinPoint.proceed();
        System.out.println("环绕通知： 在目标方法之后，提交事务" );
        //2. 在目标方法的前或者后加入功能

        // 返回目标方法的执行结果
        return result;
    }



    @Pointcut(value = "execution(* *..SomeServiceImpl.doAround(..))" )
    private void myPoint(){

    }

    @AfterThrowing(value = "myPoint()")
    public void afterThrowing(Exception exception){

    }

    @AfterReturning(value = "myPoint()")
    public void afterReturning(){

    }


}
