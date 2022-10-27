package model;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sahithigaddam
 */
public class EncounterHistory {
    private List<Encounter> encounters;

    public EncounterHistory() {
        encounters = new ArrayList<Encounter>();
    }

    public EncounterHistory(List<Encounter> encounters) {
        this.encounters = encounters;
    }

    public List<Encounter> getEncounters() {
        return encounters;
    }

    public void setEncounters(List<Encounter> encounters) {
        this.encounters = encounters;
    }
    
}
