package com.example.listofemployeestest.javaclasses.entity;

import java.util.List;

public class Employee {
    private String name;
    private String phone_number;
    private List<String> skills;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", skills=" + skills +
                '}';
    }
}
