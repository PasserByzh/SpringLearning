package com.passerbyzh.demo1;


import org.springframework.stereotype.Component;

/*
* @Component 创建对象的，等同于<bean>功能
* 属性: value 就是对象的名称，也就是bean的id值，
*       value的值是唯一的，创建的对象在整个Spring容器中就一个
*
* @Component(value = "myStudent")等同于
* <bean id="myStudent" class="com.passerbyzh.demo1.Student"/>
*
* 1. @Repository(用在持久层类的上面)：放在dao的实现类上面，表示创建dao对象，dao对象是能访问数据库的
* 2. @Service(用在业务层类的上面)：放在service实现类上面，创建service对象，service对象是做业务处理，可以有事务功能的。
* 3. @Controller(放在控制器的上面)：放在控制器类的上面，创建控制器的，（控制器对象，能够接受用户提交的参数，显示请求的处理结果）
* 以上三个注解的语法和@Component 一样的。都能创建对象，但是这三个注解还有额外的含义。
*  @Repository、@Service、@Controller给项目分层用的。
*
* */
@Component(value = "myStudent")
// 不指定对象名称，由Spring提供默认名称：类的首字母小写
//@Component
public class Student {
    private String name;
    private Integer age;

    public Student() {
        System.out.println("Student 无参构造方法执行");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
