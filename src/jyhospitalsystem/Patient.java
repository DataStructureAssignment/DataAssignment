/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyhospitalsystem;
import java.util.Date;


public class Patient {
    private String name;
    private int symptoms;
    protected String priority;
    private long time; 
    
    public Patient(String name, int symptoms) {
        this.name = name;
        this.symptoms = symptoms;
        this.time = System.currentTimeMillis();
        Priority(symptoms);
    }
    
    public void Priority(int symptoms){
        switch (symptoms) {
                case 1:
                    priority = "Low";
                break;
                case 2:
                    priority = "Low";
                break;
                case 3:
                    priority = "High";
                break;
                case 4:
                    priority = "High";
                break;
                case 5:
                    priority = "High";
                break;
                default:
                    priority = "Low";
                break;
                }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(int symptoms) {
        this.symptoms = symptoms;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Patient Name: " + name + "\nSickness: " + symptoms + "\nPriority: " + priority + "\nTime: " + time;
    }
    
}
