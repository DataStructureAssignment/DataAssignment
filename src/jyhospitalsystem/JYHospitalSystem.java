/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyhospitalsystem;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JYHospitalSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnInt = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("Hospital Management System");
        System.out.println("==========================");
        System.out.print("\n\nChoose the function that you want to use:\n");
        System.out.println("1. Queue System");
        System.out.println("2. Doctor Management System");
        System.out.print("Enter your choice:");
        int choice = scnInt.nextInt();
        switch (choice){
            case 1: QueueManagement(); 
            break;
            default: System.out.println("Wrong choice!");
            break;
    }
    }
        public static void QueueManagement(){
        Scanner scn = new Scanner(System.in);
        Scanner scnString = new Scanner(System.in);
       //show current queue here
       System.out.println("Press 1 to add a new patient");
       int choice = scn.nextInt();
       scn.reset();
       String name = "";
       int sickness = -1;
       int seriousness = 0;
      if (choice == 1){
               System.out.print("Enter patient name: ");
               
               name = scnString.nextLine();
               System.out.println("Enter the sickness type: ");
               System.out.println("1. Outpatient");
               System.out.println("2. Emergency");
               System.out.println("3. Chronic disease");
               scn.reset();
               sickness = scn.nextInt();
               switch (sickness) {
                case 1:
                    seriousness = 0;
                break;
                case 2:
                    seriousness = 1;
                break;
                default:
                    seriousness = 0;
                break;
                }
      }
      else{
               System.out.println("Enter the right input!");
       }
       Patient p1;
        p1 = new Patient(name,sickness,seriousness);
    System.out.println(p1.toString());
}
}
