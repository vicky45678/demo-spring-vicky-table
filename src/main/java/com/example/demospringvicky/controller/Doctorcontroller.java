package com.example.demospringvicky.controller;

import com.example.demospringvicky.model.Doctor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Doctorcontroller {
    List<Doctor> doctorList=new ArrayList<>();

    @RequestMapping("/get_Doctor")
    public List<Doctor> display(){

        return doctorList;
    }
    @RequestMapping("/add_Doctor")
    public String add_doctor(){
        Doctor doctor=new Doctor("dr kalyan","neuro sugen",9,988);
        doctorList.add(doctor);
        return "add_doctor..."+doctor.getDoctorName();
    }
    @RequestMapping("/remove_Doctor")
    public String remove_Doctor(){
        try {
            doctorList.remove(0);
            return "remove" +doctorList.get(0).getDoctorName();
        }
        catch (Exception e){
            return "Exception occured";
        }

    }
    @RequestMapping("/update_Doctor")
    public String update_doctor(){
        Doctor doctor=doctorList.get(0);
        doctor.setDoctorName("dr kalyan");
        doctorList.add(doctor);
        return "update..."+doctor.getDoctorName();

    }
}
