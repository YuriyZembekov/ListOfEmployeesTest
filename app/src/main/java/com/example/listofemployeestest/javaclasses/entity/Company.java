package com.example.listofemployeestest.javaclasses.entity;

import java.util.List;

// Класс-сущность участвует в иерархии классов в читаемом JSON
public class Company {
    private String name;
    private String age;
    private List<String> competences;
    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }
}
