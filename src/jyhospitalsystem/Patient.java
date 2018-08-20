/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyhospitalsystem;
import java.util.Date;


public class Patient {
    private String name;
    private int sickness;
    private int seriousness;
    private Date date;
    
    public Patient(String name, int sickness, int seriousness) {
        this.name = name;
        this.sickness = sickness;
        this.seriousness = seriousness;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Patient Name: " + name + "\nSickness: " + sickness + "\nSeriousness: " + seriousness + "\nDate: " + date;
    }
    
}
