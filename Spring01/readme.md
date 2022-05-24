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
5. 测试Spring创建的对象。