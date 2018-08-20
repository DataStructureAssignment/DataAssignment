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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSickness() {
        return sickness;
    }

    public void setSickness(int sickness) {
        this.sickness = sickness;
    }

    public int getSeriousness() {
        return seriousness;
    }

    public void setSeriousness(int seriousness) {
        this.seriousness = seriousness;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Patient Name: " + name + "\nSickness: " + sickness + "\nSeriousness: " + seriousness + "\nDate: " + date;
    }
    
}
