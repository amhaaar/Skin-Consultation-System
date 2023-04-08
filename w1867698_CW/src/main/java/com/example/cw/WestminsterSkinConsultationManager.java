package com.example.cw;

import java.io.*;
import java.util.ArrayList;

public class WestminsterSkinConsultationManager implements SkinConsultationManager {

    ArrayList<Doctor> doctorList = new ArrayList<>();


    //Adding
    @Override
    public void addDoctor(Doctor doctor) {
        doctorList.add(doctor);
    }

    @Override
    public void deleteDoctor(int medicalLicenseNumber) {

        int itemToRemove = -1;

        for (int i = 0; i < doctorList.size(); i++) {
            if (doctorList.get(i).getMedicalLicenseNumber() == medicalLicenseNumber) {
                itemToRemove = i;
                break;
            }
        }

        if (itemToRemove == -1) {
            System.out.println("License  number unavailable" );
        } else {
            doctorList.remove(itemToRemove);
        }

    }

    @Override
    public void printDoctor() {
        for (Doctor doctor : doctorList) {
            System.out.println(doctor);
        }

    }

    @Override
    public void saveToFile()  {
        try {
            FileOutputStream f = new FileOutputStream(new File("doctorFile.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            for (Doctor doctor : doctorList) {
                o.writeObject(doctor);
            }
            o.close();
            f.close();

            System.out.println("Successfully saved to file" + "\n" + "-------------------------------");

        } catch (IOException e) {
            System.out.println("Error when saving");
        }

    }

    public void readFile() {
        try {
            FileInputStream fi = new FileInputStream(new File("doctorFile.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            while (true) {
                try {
                    Doctor doctor = (Doctor) oi.readObject();
                    doctorList.add(doctor);
                }
                catch (IOException | ClassNotFoundException e ){
                    break;
                }

            }

            oi.close();
            fi.close();
            System.out.println("Data has been loaded successfully" + "\n" + "-------------------------------");

        } catch (IOException e){
            System.out.println("File not found");
        }
    }



}
