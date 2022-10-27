package model;

import java.util.ArrayList;
import java.util.List;
import model.Patient;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sahithigaddam
 */
public class PatientDirectory {
    private static List<Patient> patients;

    public PatientDirectory() {
    }

    public PatientDirectory(List<Patient> patients) {
        this.patients = patients;
    }

    public static List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
    
}
