package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author varshareddykumbham
 */
public class Patient extends Person {
    private String phoneNumber;
    private String streetAddress;
    private String community;
    private String city;
    private Long postalCode;
    private EncounterHistory encounterHistory;

    public Patient() {
    }

    public Patient(String phoneNumber, String streetAddress, String community, String city, Long postalCode, EncounterHistory encounterHistory) {
        this.phoneNumber = phoneNumber;
        this.streetAddress = streetAddress;
        this.community = community;
        this.city = city;
        this.postalCode = postalCode;
        this.encounterHistory = encounterHistory;
    }

    public Patient(String phoneNumber, String streetAddress, String community, String city, Long postalCode, String name, String id, int age, String gender, String userName, String passWord, EncounterHistory encounterHistory) {
        super(name, id, age, gender, userName, passWord);
        this.phoneNumber = phoneNumber;
        this.streetAddress = streetAddress;
        this.community = community;
        this.city = city;
        this.postalCode = postalCode;
        this.encounterHistory = encounterHistory;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Long postalCode) {
        this.postalCode = postalCode;
    }
    
}
