package model;

import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author devikaboddu
 */
public class Encounter {
    private String encounterId;
    private String patientName;
    private int patientAge;
    private String patientId;
    private VitalSigns vitalSigns;
    private String doctorName;
    private Date encounterDate;
    private EncounterHistory encounterHistory;

    public Encounter() {
    }

    public Encounter(String encounterId, String patientName, int patientAge, String patientId, VitalSigns vitalSigns, 
            String doctorName, Date encounterDate) {
        this.encounterId = encounterId;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientId = patientId;
        this.vitalSigns = vitalSigns;
        this.doctorName = doctorName;
        this.encounterDate = encounterDate;
        //this.encounterHistory = encounterHistory;
    }

    public String getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    
    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public void setEncounterDate(Date encounterDate) {
        this.encounterDate = encounterDate;
    }

    public Date getEncounterDate() {
        return encounterDate;
    }
    
    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }
    
}
