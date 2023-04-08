package com.example.cw;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", dob=" + dob +
                '}';
    }

    //Creating variables
    private String name;
    private String surname;
    private int mobileNumber;
    private Date dob;


    //Get and Set methods

    //com.example.cw.Person name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //com.example.cw.Person surname
    public String getSurname() {
        return surname;
    }

    public void setSurname(String Surname) {
        this.surname = Surname;
    }

    //com.example.cw.Person mobile number
    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    //com.example.cw.Person Date of Birth
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
