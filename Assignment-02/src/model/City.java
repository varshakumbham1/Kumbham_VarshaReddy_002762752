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
public class City {
    private String cityName;
    private List<Community> communities;
    private String cityState;

    public City(String cityName, List<Community> communities, String cityState) {
        this.cityName = cityName;
        this.communities = communities;
        this.cityState = cityState;
    }
    
    public City(String cityName, String cityState) {
        this.cityName = cityName;
        this.cityState = cityState;
    }
    
    public List<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(List<Community> communities) {
        this.communities = communities;
    }
    
    
    public City() {

    }

    

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


    public void setCityState(String cityState) {
        this.cityState = cityState;
    }

    public String getCityName() {
        return cityName;
    }


    public String getCityState() {
        return cityState;
    }

}