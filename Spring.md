[官方文档地址](https://docs.spring.io/spring-framework/docs/current/reference/html/)

Spring  管理对象，管理对象之间的关系，减轻项目之间的管理，类和类之间的管理

核心技术 -> IOC & AOP

依赖：classA中使用了classB中的属性或方法，叫做classA依赖于classB



# 1、Spring概述

###### 1.1 Spring框架是什么？

###### 1.2 Spring优点

（1） 轻量

（2） 针对接口编程，解耦合

（3） AOP变成的支持

（4） 方便继承各种优秀框架

###### 1.3 Spring 体系结构

![img](https://img-blog.csdnimg.cn/2020031110534271.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2hlbGxvX3dvcmQy,size_16,color_FFFFFF,t_70)





**IOC(Inversion of Control)**

>  控制反转，把对象的创建，赋值，管理工作都交给代码之外的容器实现。容器，是一个服务器软件，一个框架（Spring）
>
> 目的：减少代码的改动，也能实现不同的功能。实现解耦合。
>
> DI(Dependency Injection)：依赖注入，是IOC技术的实现，只需要在程序中提供要使用的对象名称就可以，至于对象如何在容器中创建，赋值，查找都由容器实现。
>
> Spring底层创建对象，使用的是反射机制。


- @Component
- @Respotory
- @Service
- @Controller
- @Vlaue
- @Autowired
- @Resource


IOC 能实现解耦合
IOC 能实现业务对象之间的解耦合，例如service和dao对象之间的解耦合。

























