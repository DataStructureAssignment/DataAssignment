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

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public int getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(int patientNumber) {
        this.patientNumber = patientNumber;
    }
    
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
