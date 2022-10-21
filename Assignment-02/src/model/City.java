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
    
    public City() {

    }

    public City(String cityName, List communities, String cityState) {
        this.cityName = cityName;
        this.communities = communities;
        this.cityState = cityState;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCommunities(List<Community> communities) {
        this.communities = communities;
    }

    public void setCityState(String cityState) {
        this.cityState = cityState;
    }

    public String getCityName() {
        return cityName;
    }

    public List<Community> getCommunities() {
        return communities;
    }

    public String getCityState() {
        return cityState;
    }

}