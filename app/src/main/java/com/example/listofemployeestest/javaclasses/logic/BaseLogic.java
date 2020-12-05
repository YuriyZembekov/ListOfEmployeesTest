package com.example.listofemployeestest.javaclasses.logic;

import com.example.listofemployeestest.javaclasses.entity.Employee;
import com.example.listofemployeestest.javaclasses.entity.World;
import  com.example.listofemployeestest.javaclasses.input.*;

import java.util.List;

public class BaseLogic {
    //Назначение интерфейсам вариатов реализации
    // при текущем положении вещей падает с NPE
    // если закомментить строку "2" и раскоментровать строку "1"
    // приложение будет работать
    // строка 1 - данные жестко прописаны в программе
    // строка 2 - данные читаются с сайта
    //private  final  InputDataInterface inputData = new InputDataHardware(); //1
    private final InputDataInterface inputData = new InputDataFromWeb(); //2
    private final Parser parser = new ParserJson();

    public List<Employee> start() {
        String jsonAsString = inputData.getPageAsString();
        World world = parser.parseStringToWorld(jsonAsString);
        List<Employee> employees = world
                .getCompany()
                .getEmployees();
        return employees;
    }
}
