/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyhospitalsystem;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

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
            break;
            case 3: runSimulation();
            break;
            default: System.out.println("Wrong choice!");
            break;

    }
    }
        public static void PatientRegistration(){
            
        Patient patient1 = new Patient("Mike", 1);
        Patient patient2 = new Patient("Micheal", 1);
        Patient patient3 = new Patient("Mitch", 3);
        Patient patient4 = new Patient("Meak", 1);
        Patient patient5 = new Patient("Ali", 2);
        Patient patient6 = new Patient("Abu", 4);
        Patient patient7 = new Patient("Ahmad", 5);
            
        LinkedListInterface<Patient> patientQueue = new QueueSystem<>();
        
        patientQueue.add(patient1);
        patientQueue.add(patient2);
        patientQueue.add(patient3);
        patientQueue.add(patient4);
        patientQueue.add(patient5);
        patientQueue.add(patient6);
        patientQueue.add(patient7);
        
        System.out.print(patientQueue.toString());
           
        patientQueue.clear();
        
        patientQueue.add(patient1);
        patientQueue.add(patient2);
        patientQueue.add(patient3);
        patientQueue.add(patient4);
        patientQueue.add(patient5);
        patientQueue.add(patient6);
        patientQueue.add(patient7);
        
        patientQueue.moveToHighPrior();
//        
//        patientQueue.dequeueHighPrior();
//        patientQueue.dequeueLowPrior();
        
//        long currentTime = System.currentTimeMillis();
//        long duration = (currentTime - patient1.getTime()) / 1000;
//        
//        if (duration >= 0) {
//            patientQueue.moveToHighPrior();
//            patient1.setPriority("High");
//        }
        
//        Scanner scn = new Scanner(System.in);
//        Scanner scnString = new Scanner(System.in);
//       scn.reset();
//       String name = "";
//       int symptoms = -1;
//        String choice2 = "";
//       while (!"n".equals(choice2)){
//               System.out.print("Enter patient name: ");1

//               
//               name = scnString.nextLine();
//               System.out.println("What are the notable symptoms: ");
//               System.out.println("1. Running nose, Fever");
//               System.out.println("2. Cough, Sore throat");
//               System.out.println("3. Broken bones");
//               System.out.println("4. Breathing difficulties");
//               System.out.println("5. EMERGENCY");
//               scn.reset();
//               symptoms = scn.nextInt();
//               scn.reset();
//               
//     Patient newPatient = new Patient(name,symptoms);
//     patientQueue.addToBehind(newPatient);
//    System.out.print("Do you want to add another patient?");
//   choice2 = scnString.nextLine();
//    scnString.reset();
//   }
   
//   System.out.print("\n"+ patientQueue.toString());
       
}
        
        public static void doctorManagement(){
        List<Doctor> doctor = new ArrayList<>(10);  
        doctor.add(new Doctor("001","Ambrose","Male","20","0145905857","PV13","normal","outpatient"));
        doctor.add(new Doctor("002","Alex","Male","21","012313232","PV14","retired","emergency"));
        
        System.out.println("Which option do you want to choose?");
        System.out.println("1. Add new doctor.\n2. Modify doctor's details");
        boolean answer = true;
        
        //Check choice
       do{
        System.out.print("Enter your choice - ");
        Scanner scn = new Scanner(System.in);
        int option = scn.nextInt();
        switch(option){
            case 1: Doctor.addDoctor(doctor);
            break;
            case 2: Doctor.modifyDoctor(doctor);
            break;
            default: System.out.println("Wrong option!");
            answer = false;
            scn.reset();
            break;
        }
       }while(answer != true);
    }
        
        public static void runSimulation(){
        
        Patient[] patientList = new Patient[7];
        patientList[0] = new Patient("Mike", 1);
        patientList[1] = new Patient("Micheal", 1);
        patientList[2] = new Patient("Mitch", 3);
        patientList[3] = new Patient("Meak", 1);
        patientList[4] = new Patient("Ali", 2);
        patientList[5] = new Patient("Abu", 4);
        patientList[6] = new Patient("Ahmad", 5);
        
        LinkedListInterface<Patient> patientQueue = new QueueSystem<>();
        
        final Timer arrivalTimer = new Timer();
        final TimerTask arrival =  new TimerTask(){
            boolean run = true;
            int i = 0;
            public void run(){
                if (i >= patientList.length) {
                    arrivalTimer.cancel();
                    arrivalTimer.purge();
                    return;
                } else {
                    patientList[i].setTime(System.currentTimeMillis());
                    patientQueue.add(patientList[i]);
                    i += 1;
                    System.out.print(patientQueue.toString());
                    System.out.println("======================");
                }
            }
            
        };
        arrivalTimer.scheduleAtFixedRate(arrival,0,1000); 
        
        }
}
