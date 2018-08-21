package jyhospitalsystem;

import java.util.List;
import java.util.Scanner;

public class Doctor {
    private String doctorId;
    private String doctorName;
    private String doctorGender;
    private String doctorAge;
    private String doctorPhoneNum;
    private String doctorAddress;
    private String doctorStatus;
    private String doctorCategory;
    
    public Doctor(String doctorId, String doctorName, String doctorGender, String doctorAge,
            String doctorPhoneNum, String doctorAddress, String doctorStatus, String doctorCategory){
        this.doctorId= doctorId;
        this.doctorName= doctorName;
        this.doctorGender= doctorGender;
        this.doctorAge= doctorAge;
        this.doctorPhoneNum= doctorPhoneNum;
        this.doctorAddress= doctorAddress;
        this.doctorStatus= doctorStatus;
        this.doctorCategory= doctorCategory;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorGender() {
        return doctorGender;
    }

    public void setDoctorGender(String doctorGender) {
        this.doctorGender = doctorGender;
    }

    public String getDoctorAge() {
        return doctorAge;
    }

    public void setDoctorAge(String doctorAge) {
        this.doctorAge = doctorAge;
    }

    public String getDoctorPhoneNum() {
        return doctorPhoneNum;
    }

    public void setDoctorPhoneNum(String doctorPhoneNum) {
        this.doctorPhoneNum = doctorPhoneNum;
    }

    public String getDoctorAddress() {
        return doctorAddress;
    }

    public void setDoctorAddress(String doctorAddress) {
        this.doctorAddress = doctorAddress;
    }

    public String getDoctorStatus() {
        return doctorStatus;
    }

    public void setDoctorStatus(String doctorStatus) {
        this.doctorStatus = doctorStatus;
    }

    public String getDoctorCategory() {
        return doctorCategory;
    }

    public void setDoctorCategory(String doctorCategory) {
        this.doctorCategory = doctorCategory;
    }

    @Override
    public String toString() {
        return doctorId + "\t" + doctorName + "\t\t" + doctorGender + "\t" + doctorAge 
                +"\t" + doctorPhoneNum + "\t" + doctorAddress + "\t" + doctorStatus
                + "\t\t" + doctorCategory;
    }
    public static void addDoctor(List <Doctor> doctor){
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
        System.out.print("Enter the doctor category: ");
        String category = scn.nextLine();
        
        String status = "active";
        
        doctor.add(new Doctor(id ,name, gender, age, number, address, status, category));
        
        for(int i=0; i < doctor.size() ; i++){
            System.out.println( i+1 + "\t" + doctor.get(i));
        }
        } 
    
    public static void modifyDoctor(List <Doctor> doctor){
        Scanner scn = new Scanner(System.in);
         for(int i=0; i < doctor.size() ; i++){
            System.out.println( i+1 + "\t" + doctor.get(i));
        }
        System.out.println("Which doctor do you want to modify?");
        System.out.print("Please enter their No - ");
        int no = scn.nextInt();
        System.out.println(doctor.get(no-1));
        
        System.out.println("Which part do you want to modify?");
        System.out.println("1.Name\n2.Age\n3.Phone Number\n4.Adress\n5.Status\n"
                + "6.Category");
        System.out.print("Enter the part you want to change. - ");
        scn.reset();
        int part = scn.nextInt();
        
         Scanner scn1 = new Scanner(System.in);
        switch(part){
            case 1 :
                System.out.print("Enter new name: ");
                String name = scn1.nextLine();
                doctor.get(no-1).setDoctorName(name);
                break;
            case 2 :
                System.out.print("Enter new age: ");
                String age = scn1.nextLine();
                doctor.get(no-1).setDoctorGender(age);
                break;
            case 3 :
                System.out.print("Enter new phone number: ");
                String number = scn1.nextLine();
                doctor.get(no-1).setDoctorAge(number);
                break;
            case 4 :
                System.out.print("Enter new address: ");
                String address = scn1.nextLine();
                doctor.get(no-1).setDoctorPhoneNum(address);
                break;
            case 5 :   
                System.out.print("Enter new doctor's status: ");
                String status = scn1.nextLine();
                doctor.get(no-1).setDoctorAddress(status);
                break;
            case 6 :
                System.out.print("Enter new doctor's category: ");
                String category = scn1.nextLine();
                doctor.get(no-1).setDoctorStatus(category);
                break;
            
        }
        System.out.println(doctor.get(0));
    }
    
}
