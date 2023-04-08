package com.example.cw;

public interface SkinConsultationManager {

    void addDoctor(Doctor doctor);
    void deleteDoctor(int medicalLicenseNumber);
    void printDoctor();
    void saveToFile() ;


}
