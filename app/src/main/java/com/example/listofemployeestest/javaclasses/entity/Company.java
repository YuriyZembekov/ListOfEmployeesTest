package com.example.listofemployeestest.javaclasses.entity;

import java.util.List;

public class Company {
    private String name;
    private String age;
    private List<String> competences;
    private List<Employee> employees;

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", competences=" + competences +
                ", employees=" + employees +
                '}';
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
