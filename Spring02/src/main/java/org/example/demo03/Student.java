package org.example.demo03;

public class Student {
    private String name;
    private int age;

    private School school;

    public Student() {
        System.out.println("Spring 会调用类的无参构造方法创建对象");
    }

    public Student(String name, int age, School school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }


    public void setSchool(School school) {
        System.out.println("Student.class setSchool: "+ school);
        this.school = school;
    }

    public void setName(String name) {
        System.out.println("Student.class setName: "+ name);
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("Student.class setAge: "+ age);
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
