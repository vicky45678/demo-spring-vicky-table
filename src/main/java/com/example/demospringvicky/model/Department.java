package com.example.demospringvicky.model;

public class Department {
    String name;
    String post;
    String district;
    String gender;
    int nu;
    int salary;

    public Department(String name, String post, String district, int nu, int salary) {
        this.name = name;
        this.post = post;
        this.district = district;
        this.nu = nu;
        this.salary = salary;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getPost() {

        return post;
    }

    public void setPost(String post) {

        this.post = post;
    }

    public String getDistrict() {

        return district;
    }

    public void setDistrict(String district) {

        this.district = district;
    }

    public int getNu() {
        return nu;
    }

    public void setNu(int nu) {
        this.nu = nu;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
