package com.passerbyzh.demo4;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
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

    /*
    * @value：简单类型的属性赋值
    *   属性：value是String类型的，表示简单类型的属性值
    *   位置：1. 在属性定义的上面，无需set方法，推荐使用
    *       2. set方法上面
    * */
    @Value("PasserByzh")
    private String name;
    private Integer age;

    /*
    * 引用类型
    * @Autowired： Spring框架提供的注解，实现引用类型的赋值
    * Spring 中通过注解给引用类型赋值，使用的是自动注入原理，支持byName,byType
    * @Autowired 默认使用的是byType自动注入
    * 位置：1.在属性定义的上面，无需set方法
    *       2. 在set方法上面
    *
    *
    * 如果要使用byName 方式，需要做的是：
    * 1. 在属性上面加入@Autowired
    * 2. 在属性上面加入@Qualifier(value="bean的id")：表示使用指定名称的bean完成赋值
    * */

    // byName自动注入
    @Qualifier("mySchool")
    @Autowired
    private School school;

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

    @Value("30")
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
