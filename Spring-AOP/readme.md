1. 动态代理 
   - 实现方式
     - JDK 动态代理，使用JDK中的Proxy，Method，InvocationHandler创建代理对象，jdk动态代理要求目标列必须实现接口
     - cglib动态代理，第三方的工具库，创建代理对象，原理是继承，通过继承目标类，创建子类，子类就是代理对象，要求目标类不能是final的，方法不能是final。
   - 作用
     - 在目标类源代码不改变的情况下，增加新功能。
     - 减少代码的重复
     - 专注业务逻辑代码
     - 解耦合
2. AOP（Aspect Orient Programming）面向切面变成，基于动态代理的，可以使用jdk，cglib两种代理方式。AOP就是动态代理的规范化，把动态代理的实现步骤，方式都定义好了，让开发者用一种统一的方式，使用动态代理。
   - 切面（Aspect），给你的目标类增加的功能，就是切面。切面是动作，把通知应用到切入点过程。切面的特点：一般都是非业务方法，独立使用的。就是一堆代码，完成某一个功能。非业务功能。常见的切面功能有日志，事务，统计信息，参数检查，权限验证。
   - 连接点(JoinPoint)，连接业务方法和切面的位置，就是某类中的业务方法
   - 切入点(PointCut)，指多个连接点的集合。多个方法。
   - 目标对象：给哪个类增加功能，这个类就是目标类。
   - 通知(Advice)：通知表示切面功能执行的时间
     - 前置通知 @Before
     - 后置通知 @After
     - 环绕通知 @Around
     - 异常通知 @AfterThrowing
     - 最终通知 @AfterReturning
   
    

AOP技术实现框架：
    AspectJ：开源，专门做aop的框架，Spring框架中继承了AspectJ框架，
    AspectJ框架实现AOP有两种方式：
    1. 使用xml的配置文件：配置全局事务
    2. 使用注解

AspectJ框架的使用：
    切入点表达式

```
    execute(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern)throws-pattern?)
    
    modifiers-pattern: 访问权限类型，public,private...
    ret-type-pattern: 返回值类型
    declaring-type-pattern: 包名类名
    name-pattern(param-pattern): 方法名(参数类型和参数个数）
    throws-pattern: 抛出异常类型   
    ？ 表示可选部分
   
    以上表达式共4个部分：
    execute(访问权限 方法返回值 方法声明(参数) 异常类型)     
    其中，方法返回值，方法声明是必需的
    
    通配符：
    *：0至多个任一字符
    ..： 用在方法参数中，表示任意多个参数；用在包名后，表示当前包及其子包路径
    +：用在类名后，表示当前类及其子类；用在接口后，表示当前接口及其实现类
     
    举例：
    execution(public * *(..))： 指定切入点为，任一公共方法
    execution(* set*(..)): 指定切入点为，任何一个以"set"开始的方法
    execution(* com.passerbyzh.service.*.*(..)):指定切入点为， service中的任意类中的任意方法
    execution(* com.passerbyzh.service..*.*(..)):指定切入点为，定义在service包或者子包里的任意类的任意方法。出现".."在类名中时，后面必需跟"*"，表示包、子包下的所有类。
    execution(* *..service.*.*(..)):指定所有包下的service子包下所有类（接口）中所有方法为切入点
    execution(* *.service.*.*(..)) 指定只有一级包下的service子包下所有类（接口）中所有的方法为切入点
```

    




























    