package com.example.demospringvicky.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Table_controller {

    @RequestMapping("/multiply")
    public void for_table(int a){
        for (int i=1; i<=10; ++i){
            System.out.println(a+"*"+i+"="+(a*i));
            return;

        }
    }
    @RequestMapping
    public static void main(String args[]){
        Table_controller variable=new Table_controller();
        variable.for_table(9);
        return;
    }
}
