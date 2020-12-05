package com.example.listofemployeestest.javaclasses.entity;

import java.util.List;

public class Employee {
    private String name;
    private String phone_number;
    private List<String> skills;

    @Override
    public String toString() {
        return  '\n' +"name='" + name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", skills=" + skills +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public List<String> getSkills() {
        return skills;
    }
}
