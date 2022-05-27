package com.passerbyzh.demo4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mySchool")
public class School {
    @Value("浙江杭州市")
    private String address;
    @Value("杭州大学")
    private String name;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "School{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
