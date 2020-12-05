package com.example.listofemployeestest.javaclasses.logic;

import com.example.listofemployeestest.javaclasses.entity.Employee;
import com.example.listofemployeestest.javaclasses.entity.World;
import  com.example.listofemployeestest.javaclasses.input.*;

import java.util.List;

// В классе содержится основная логика по чтению
// и распознованию информации
public class BaseLogic {
    private final InputDataInterface inputData = new InputDataFromWeb();
    private final Parser parser = new ParserJson();

    // Метод получает json в виде строки
    // парсит данные в иерархию классов
    // и возвращает из иерархии список сотрудников
    public List<Employee> start() {
        String jsonAsString = inputData.getPageAsString();
        World world = parser.parseStringToWorld(jsonAsString);
        List<Employee> employees = world
                .getCompany()
                .getEmployees();
        return employees;
    }
}
