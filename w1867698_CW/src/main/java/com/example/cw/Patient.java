package com.example.cw;

//Creating Patient subclass from Superclass Person
public class Patient extends Person {
    private int patientId;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
