package com.example.demo;

public class Employee {
    private long id;
    private String name;
    private String lastname;
    private int SSN;
    private int DOB;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlastname() {
        return lastname;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }


    public int getSSN() {
        return SSN;
    }

    public void setDOB(int DOB) {
        this.DOB = DOB;
    }
    public int getDOB() {
        return DOB;
}

}