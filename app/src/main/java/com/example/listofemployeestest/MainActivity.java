package com.example.listofemployeestest;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.example.listofemployeestest.adapter.EmployeesAdapter;
import com.example.listofemployeestest.javaclasses.entity.Employee;
import com.example.listofemployeestest.javaclasses.logic.BaseLogic;
import com.example.listofemployeestest.javaclasses.logic.NameComparatorForEmployee;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

// Основной класс-активность, отображает информацию на экране
public class MainActivity extends Activity {

    private List<Employee> emloyees = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListOfEmployees();
        RecyclerView employeesRecyclerView =
                (RecyclerView) findViewById(R.id.recycler_view_for_employees);
        EmployeesAdapter employeesAdapter = new EmployeesAdapter(this, emloyees);
        employeesRecyclerView.setAdapter(employeesAdapter);

    }

    // метод инициализирует и сортирует список сотрудников
    private void initListOfEmployees(){
        AsyncTaskForNetworkConnection asyncTaskGetListOfEmployees =
                new AsyncTaskForNetworkConnection();
        asyncTaskGetListOfEmployees.execute();
        try {
            emloyees = asyncTaskGetListOfEmployees.get();
            Collections.sort(emloyees, new NameComparatorForEmployee());
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Вспомогательный класс для запуска интернет-соединения и получению
    // информации
    class AsyncTaskForNetworkConnection extends AsyncTask<Void, Void, List<Employee>> {
        @Override
        protected List<Employee> doInBackground(Void... voids) {
            return new BaseLogic().start();
        }

        @Override
        protected void onPostExecute(List<Employee> s) {
            super.onPostExecute(s);
        }
    }
}