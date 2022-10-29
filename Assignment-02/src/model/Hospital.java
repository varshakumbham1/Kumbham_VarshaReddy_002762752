package model;


import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author devikaboddu
 */
public class Hospital  {
    private String hospitalName;
    private String hospitalCommunity;
    private Long hospitalCode;
    private String hospitalCity;
    private Long postalCode;
    //private List<Doctor> doctor;
    
    public Hospital() {
    }

    public Hospital(String hospitalName, String hospitalCommunity, Long hospitalCode, String hospitalCity, Long postalCode) {
        this.hospitalName = hospitalName;
        this.hospitalCommunity = hospitalCommunity;
        this.hospitalCode = hospitalCode;
        this.hospitalCity = hospitalCity;
        this.postalCode = postalCode;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalCommunity() {
        return hospitalCommunity;
    }

    public void setHospitalCommunity(String hospitalCommunity) {
        this.hospitalCommunity = hospitalCommunity;
    }

    public Long getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(Long hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    public String getHospitalCity() {
        return hospitalCity;
    }

    public void setHospitalCity(String hospitalCity) {
        this.hospitalCity = hospitalCity;
    }

    public Long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Long postalCode) {
        this.postalCode = postalCode;
    }
    
    
    
    
    
}
