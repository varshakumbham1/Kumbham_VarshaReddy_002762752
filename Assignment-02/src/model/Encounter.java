package model;

import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author varshareddykumbham
 */
public class Encounter {
    private String encounterId;
    private VitalSigns vitalSigns;
    private Date encounterDate;
    private String patientName;
    private String patientId;
    private String doctorName;

    public Encounter() {
    }

    public Encounter(String encounterId, VitalSigns vitalSigns, Date encounterDate, String patientName, String patientId, String doctorName) {
        this.encounterId = encounterId;
        this.vitalSigns = vitalSigns;
        this.encounterDate = encounterDate;
        this.patientName = patientName;
        this.patientId = patientId;
        this.doctorName = doctorName;
    }

    public String getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public Date getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(Date encounterDate) {
        this.encounterDate = encounterDate;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
}
