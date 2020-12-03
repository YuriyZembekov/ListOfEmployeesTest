package com.example.listofemployeestest;

import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;
import com.example.listofemployeestest.javaclasses.entity.Employee;
import com.example.listofemployeestest.javaclasses.logic.BaseLogic;

import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Employee> employees = new BaseLogic().start();
        //получение ссылки на текстовое поле
        TextView listOfEmployees = (TextView) findViewById(R.id.textField);
        listOfEmployees.setText(employees.toString());
    }
}