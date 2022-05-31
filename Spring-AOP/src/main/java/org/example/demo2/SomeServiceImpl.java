package org.example.demo2;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        // 在doSome 执行之前打印执行时间
        System.out.println("SomeServiceImpl执行 name: "+name+" age:"+age);
    }

    @Override
    public String doOther(String name, Integer age) {
        return "abcd";
    }
}
