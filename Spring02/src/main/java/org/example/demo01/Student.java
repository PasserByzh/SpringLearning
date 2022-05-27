package org.example.demo01;

public class Student {
    private String name;
    private int age;

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
                '}';
    }
}