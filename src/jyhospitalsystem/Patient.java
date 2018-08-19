/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyhospitalsystem;

/**
 *
 * @author asus-pc
 */
public class Patient {
    private String patientName;
    private String patientId;
    private int patientNumber;
    
    public Patient(){
        this.patientId = null;
        this.patientName = "";
        this.patientNumber = 0;
    }
    
    public Patient(String patientName, String patientId, int patientNumber){
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientNumber = patientNumber;
    }
}
