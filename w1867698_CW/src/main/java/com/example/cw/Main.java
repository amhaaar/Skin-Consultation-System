package com.example.cw;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean condition = true;
        Scanner obj = new Scanner(System.in);
        Console.readFile();
        while (condition) {
            System.out.println("1- Doctor Menu \n2- To Exit \nEnter: ");
            int option = obj.nextInt();
            switch (option) {
                case 1:
                    System.out.println("-------------------------------\n1- Add Doctor \n2- Delete Doctor \n3- Show All Doctors \n4- Save To File \n5- Exit \nEnter: ");
                    int opt = obj.nextInt();
                    switch (opt) {
                        case 1:
                            Console.addDoctor();
                            break;
                        case 2:
                            Console.deleteDoctor();
                            break;
                        case 3:
                            Console.printDoctor();
                        case 4:
                            Console.saveToFile();
                            break;
                        case 5:
                            System.out.println("Exiting");
                            break;
                        default:
                            System.out.println("Please Enter valid option");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("You are exiting");
                    condition = false;
                    break;
                default:
                    System.out.println("Please enter a valid option");
                    break;
                }

            }


        }
    }
