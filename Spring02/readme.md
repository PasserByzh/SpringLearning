在Spring配置文件中，给Java对象的属性赋值

di：依赖注入，表示创建对象，给属性赋值。

di的实现方式有两种：
- 1.在spring 配置文件中，使用标签和属性完成，叫做基于xml的di实现。
- 2.使用Spring的注解，完成属性赋值，叫做基于注解的di实现

```java
di的语法分类：
1. set注入（设置注入）：Spring调用类的set方法，在set方法中实现属性的赋值，80%左右都是使用set注入
2. 构造注入，spring调用类的有参构造，创建对象。在构造方法中完成赋值
```


实现步骤：
1. 创建maven项目
2. 加入maven的依赖
   Spring的依赖
   ``` java
   <!--Spring 依赖-->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>5.3.2</version>
    </dependency>
   ```
   Junit依赖
3. 创建类（接口和它的实现类）
4. 创建Spring需要使用的配置文件
   声明类的信息，这些类由Spring创建和管理
    通过Spring的语法，完成属性的赋值。
5. 测试Spring创建的对象。