package com.example.listofemployeestest.javaclasses.logic;

import com.example.listofemployeestest.javaclasses.entity.Employee;

import java.util.Comparator;

// Компаратор для сортивки сущностей Employee по имени
// в задании не было уточнено куда определять сущности без имени
// поэтому сортируем их как пустую строку и помещаем в начало списка
public class NameComparatorForEmployee implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        String nameEmployeeOne = e1.getName();
        String nameEmployeeTwo = e2.getName();
        if (nameEmployeeOne!=null && nameEmployeeTwo!=null){
            return nameEmployeeOne.compareTo(nameEmployeeTwo);
        }else if (nameEmployeeOne==null && nameEmployeeTwo!=null){
            return -1;
        } else if (nameEmployeeOne!=null && nameEmployeeTwo==null){
            return 1;
        } else {
            return 0;
        }
    }
}
