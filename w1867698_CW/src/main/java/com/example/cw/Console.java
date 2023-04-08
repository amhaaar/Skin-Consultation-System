package com.example.cw;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Console {

    static WestminsterSkinConsultationManager westminsterSkinConsultationManager = new WestminsterSkinConsultationManager();
    private static final Scanner scn = new Scanner(System.in);

    public static void addDoctor() {
        System.out.println("Enter doctor name: ");
        String docName = scn.next();

        System.out.println("Enter doctor surname: ");
        String docSurname = scn.next();

        System.out.println("Enter Mobile Number: ");
        int docMobile = scn.nextInt();

        Date dob;
        while (true) {
            try {
                System.out.println("Enter doctor date of birth (dd-mm-yy): ");
                String docDob = scn.next();
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                dob = formatter.parse(docDob);
                break;

            } catch (ParseException exception) {
                System.out.println("Insert correct date of birth");
            }
        }
        System.out.println("Enter Medical license number: ");
        int medicalNumber = scn.nextInt();

        System.out.println("Enter doctor specialization: ");
        String docSpec = scn.next();

        Doctor docObj = new Doctor();
        docObj.setName(docName);
        docObj.setSurname(docSurname);
        docObj.setMobileNumber(docMobile);
        docObj.setDob(dob);
        docObj.setMedicalLicenseNumber(medicalNumber);
        docObj.setSpecialisation(docSpec);

        westminsterSkinConsultationManager.addDoctor(docObj);
    }

    public static void deleteDoctor() {
        System.out.println("Enter doctor medical license number: ");
        int medicalNumber = scn.nextInt();

        westminsterSkinConsultationManager.deleteDoctor(medicalNumber);
        System.out.println("Successfully Deleted" + "\n" + "-------------------------------");

    }

    public static void printDoctor() {
        System.out.println("Display all the doctors: ");

        westminsterSkinConsultationManager.printDoctor();
    }

    public static void saveToFile() {
        System.out.println("Saving the data");

        westminsterSkinConsultationManager.saveToFile();
    }

    public static void readFile() {
        System.out.println("Loading the data..." );

        westminsterSkinConsultationManager.readFile();
    }
}
