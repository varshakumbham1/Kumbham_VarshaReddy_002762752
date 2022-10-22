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
    private ArrayList<Hospital> listOfHospitals;  

    public HospitalDirectory() {
    }

    public HospitalDirectory(ArrayList<Hospital> listOfHospitals) {
        this.listOfHospitals = listOfHospitals;
    }

    public List<Hospital> getListOfHospitals() {
        return listOfHospitals;
    }

    public void setListOfHospitals(ArrayList<Hospital> listOfHospitals) {
        this.listOfHospitals = listOfHospitals;
    }
}
