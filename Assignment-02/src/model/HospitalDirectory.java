package model;

import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author varshareddykumbham
 */
public class HospitalDirectory {
    private static List<Hospital> hospitals;

    public HospitalDirectory() {
        //hospitals = new ArrayList<Hospital>();
    }

    public HospitalDirectory(List<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

    public static List<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(List<Hospital> hospitals) {
        this.hospitals = hospitals;
    }
    
}
