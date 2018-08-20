/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyhospitalsystem;

import java.util.ArrayList;
import java.util.List;
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
            case 2: doctorManagement();
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
        
        public static void doctorManagement(){
        List<Doctor> doctor = new ArrayList<>(10);  
        doctor.add(new Doctor("001","Ambrose","Male","20","0145905857","PV13","normal","outpatient"));
        doctor.add(new Doctor("002","Alex","Male","21","012313232","PV14","retired","emergency"));
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the doctor ID: ");
        String id = scn.nextLine();
        scn.reset();
        System.out.print("Enter the doctor name: ");
        String name = scn.nextLine();
        scn.reset();
        System.out.print("Enter the doctor Gender: ");
        String gender = scn.nextLine();
        scn.reset();
        System.out.print("Enter the doctor Age: ");
        String age = scn.nextLine();
        scn.reset();
        System.out.print("Enter the doctor Phone Number: ");
        String number = scn.nextLine();
        scn.reset();
        System.out.print("Enter the doctor Address: ");
        String address = scn.nextLine();
        scn.reset();
        System.out.print("Enter the doctor Status: ");
        String status = scn.nextLine();
        scn.reset();
        System.out.print("Enter the doctor category: ");
        String category = scn.nextLine();
        
        Doctor d1;
        
        d1 = new Doctor(id ,name, gender, age, number, address, status, category);
        
        System.out.println(d1.toString());
        
        System.out.println(doctor.get(2));
        }
}
