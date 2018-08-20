package jyhospitalsystem;

public class Doctor {
    private int doctorId;
    private String doctorName;
    private String doctorGender;
    private int doctorAge;
    private int doctorPhoneNum;
    private String doctorAddress;
    private String doctorStatus;
    private String doctorCategory;
    
    public Doctor(int doctorId, String doctorName, String doctorGender, int doctorAge,
            int doctorPhoneNum, String doctorAddress, String doctorStatus, String doctorCategory){
        this.doctorId= doctorId;
        this.doctorName= doctorName;
        this.doctorGender= doctorGender;
        this.doctorAge= doctorAge;
        this.doctorPhoneNum= doctorPhoneNum;
        this.doctorAddress= doctorAddress;
        this.doctorStatus= doctorStatus;
        this.doctorCategory= doctorCategory;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
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

    public int getDoctorAge() {
        return doctorAge;
    }

    public void setDoctorAge(int doctorAge) {
        this.doctorAge = doctorAge;
    }

    public int getDoctorPhoneNum() {
        return doctorPhoneNum;
    }

    public void setDoctorPhoneNum(int doctorPhoneNum) {
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
        return "Doctor{" + "doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorGender=" + doctorGender + ", doctorAge=" + doctorAge + ", doctorPhoneNum=" + doctorPhoneNum + ", doctorAddress=" + doctorAddress + ", doctorStatus=" + doctorStatus + ", doctorCategory=" + doctorCategory + '}';
    }
    
    
}
