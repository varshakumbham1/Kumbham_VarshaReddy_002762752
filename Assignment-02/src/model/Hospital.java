package model;

import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author varshareddykumbham
 */
public class Hospital {
    private String hospitalName;
    private String community;
    private Long zipcode;
    private String city;
    private Long hospitalId;

    public Hospital() {
    }

    public Hospital(String hospitalName, String community, Long zipcode, String city, Long hospitalId) {
        this.hospitalName = hospitalName;
        this.community = community;
        this.zipcode = zipcode;
        this.city = city;
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }
    
    public Long getZipcode() {
        return zipcode;
    }

    public void setZipcode(Long zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hsopitalId) {
        this.hospitalId = hsopitalId;
    }
}
