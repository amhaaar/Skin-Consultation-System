package com.example.cw;

//Creating subclass Doctor from Person Superclass
public class Doctor extends Person  {
    @Override
    public String toString() {
        return "Doctor: " + "\n" + "Name: " + super.getName() + "\n" + "Surname: "+  super.getSurname() + "\n"
                + "Date Of Birth: "+ super.getDob() + "\n" + "Mobile Number: " + super.getMobileNumber() + "\n"
                + "Medical License Number: " + medicalLicenseNumber + "\n" +
                "Specialisation - " + specialisation + "\n" + "-------------------------------";
    }

    private int medicalLicenseNumber;
    private String specialisation;

    public int getMedicalLicenseNumber() {
        return medicalLicenseNumber;
    }

    public void setMedicalLicenseNumber(int medicalLicenseNumber) {
        this.medicalLicenseNumber = medicalLicenseNumber;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }
}
