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
        
        
        
        System.out.println("My name is " );
        
        String name2 = "Ambrose";
        System.out.println("MY name is " + name2);
        
        System.out.println("MY name is " + name2);
        
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
