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
        System.out.println("1. Patient Registration");
        System.out.println("2. Doctor Management System");
        System.out.print("Enter your choice:");
        int choice = scnInt.nextInt();
        switch (choice){
            case 1: PatientRegistration(); 
            break;
            case 2: doctorManagement();
            default: System.out.println("Wrong choice!");
            break;

    }
    }
        public static void PatientRegistration(){
        LinkedListInterface<Patient> patientQueue = new QueueSystem<>();
        Scanner scn = new Scanner(System.in);
        Scanner scnString = new Scanner(System.in);
       scn.reset();
       String name = "";
       int symptoms = -1;
        String choice2 = "";
       while (!"n".equals(choice2)){
               System.out.print("Enter patient name: ");
               
               name = scnString.nextLine();
               System.out.println("What are the notable symptoms: ");
               System.out.println("1. Running nose, Fever");
               System.out.println("2. Cough, Sore throat");
               System.out.println("3. Broken bones");
               System.out.println("4. Breathing difficulties");
               System.out.println("5. EMERGENCY");
               scn.reset();
               symptoms = scn.nextInt();
               scn.reset();
               
      
    Patient patient1 = new Patient(name,symptoms);
    patientQueue.addToBehind(patient1);
    System.out.print("Do you want to add another patient?");
   choice2 = scn.nextLine();
    scn.reset();
   }
    System.out.print(patientQueue.toString());
       
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
        
        doctor.add(new Doctor(id ,name, gender, age, number, address, status, category));
        
        System.out.println(doctor.get(2));
        }
}
