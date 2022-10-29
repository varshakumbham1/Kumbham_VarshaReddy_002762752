package model;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author varshareddykumbham
 */
public class PatientDirectory {
    private static ArrayList<Patient> listOfPatients;

   
    public PatientDirectory() {
        listOfPatients = new ArrayList<Patient>();
    }

    public PatientDirectory(ArrayList<Patient> listOfPatients) {
        this.listOfPatients = listOfPatients;
    }

    public static ArrayList<Patient> getListOfPatients() {
        return listOfPatients;
    }

    public void setListOfPatients(ArrayList<Patient> listOfPatients) {
        this.listOfPatients = listOfPatients;
    }
    
}
