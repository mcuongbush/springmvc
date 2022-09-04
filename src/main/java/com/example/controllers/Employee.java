package com.example.controllers;

public class Employee {
    private String username;
    private String pass;
    public  Employee(){}
    public Employee(String username, String pass) {
        this.username = username;
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
