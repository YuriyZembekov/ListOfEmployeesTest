package com.example.listofemployeestest.javaclasses.entity;

import java.util.List;

// Класс-сущность участвует в иерархии классов в читаемом JSON
public class Employee {
    private String name;
    private String phone_number;
    private List<String> skills;

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
