package com.example.listofemployeestest.javaclasses.entity;

public class World {
    private Company company;

    @Override
    public String toString() {
        return "World{" +
                "company=" + company +
                '}';
    }

    public Company getCompany() {
        return company;
    }
}
