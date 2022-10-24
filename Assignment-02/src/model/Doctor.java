package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author varshareddykumbham
 */
public class Doctor extends Person{
//    private String name;
//    private String id;
//    private String age;
//    private String gender;
    private String hospitalName;
    private String hospitalDepartment;
    private String phoneNumber;
    public Doctor() {
        
    }

    public Doctor(String hospitalName, String hospitalDepartment, String phoneNumber) {
        this.hospitalName = hospitalName;
        this.hospitalDepartment = hospitalDepartment;
        this.phoneNumber = phoneNumber;
    }

    public Doctor(String hospitalName, String hospitalDepartment, String phoneNumber, String name, String id, int age, String gender, String userName, String passWord) {
        super(name, id, age, gender, userName, passWord);
        this.hospitalName = hospitalName;
        this.hospitalDepartment = hospitalDepartment;
        this.phoneNumber = phoneNumber;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalDepartment() {
        return hospitalDepartment;
    }

    public void setHospitalDepartment(String hospitalDepartment) {
        this.hospitalDepartment = hospitalDepartment;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
}
