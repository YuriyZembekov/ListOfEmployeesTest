package com.example.listofemployeestest.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.listofemployeestest.R;
import com.example.listofemployeestest.javaclasses.entity.Employee;

import java.util.List;

// Вспомогательный класс, необходим для работы элемента RecyclerView
public class EmployeesAdapter extends RecyclerView.Adapter<EmployeesAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private List<Employee> employees;

    public EmployeesAdapter(Context context, List<Employee> employees) {
        this.employees = employees;
        this.inflater = LayoutInflater.from(context);
    }

    public EmployeesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = inflater.inflate(R.layout.list_employee, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EmployeesAdapter.ViewHolder holder, int position) {
        Employee employee = employees.get(position);
        String name = employee.getName();
        String phone = employee.getPhoneNumber();
        String skills;

        if (name == null){
            name = "";
        }
        if (phone == null){
            phone = "";
        }
        if (employee.getSkills() != null) {
            skills = employee.getSkills().toString();
        } else {
            skills = "";
        }

        holder.nameView.setText("Name: " + name);
        holder.phoneView.setText("Phone: " + phone);
        holder.skillsView.setText("Skills: " + skills);
    }

    @Override
    public int getItemCount() {
        return employees.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView nameView, phoneView, skillsView;
        ViewHolder(View view){
            super(view);
            nameView = (TextView) view.findViewById(R.id.name);
            phoneView = (TextView) view.findViewById(R.id.phone_number);
            skillsView = (TextView) view.findViewById(R.id.skills);

        }
    }

}
