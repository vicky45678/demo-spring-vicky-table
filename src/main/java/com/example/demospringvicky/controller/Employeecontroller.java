package com.example.demospringvicky.controller;

import com.example.demospringvicky.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

    @RestController
    public class Employeecontroller {
    List<Employee> employeeList=new ArrayList<>();

    @RequestMapping("/get_employee")
    public List<Employee>display(){
        return employeeList;
    }

    @RequestMapping("/add_employee")
    public String add_employee(){
        Employee employee=new Employee("vicky","S.I",110,67000);
        employeeList.add(employee);
        return "add_employee..."+employee.getName();

    }
    @RequestMapping("/remove_employee")
        public String remove_employee(){
        try {
            employeeList.remove(0);
            return "remove" + employeeList.get(0).getName();
            }
        catch (Exception e){
            return "vicky";
        }

    }
    @RequestMapping("/update_employee")
    public String update_employee(){
        Employee employee=employeeList.get(0);
        employee.setName("vicky");
        employeeList.add(employee);
        return "update..."+employee.getName();

    }

}
