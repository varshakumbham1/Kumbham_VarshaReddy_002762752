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
public class Community {
    private String communityName;
    private Long postalCode;
    private String cityName;
    private List<House> HousesList;

    public List<House> getHousesList() {
        return HousesList;
    }

    public void setHousesList(List<House> HousesList) {
        this.HousesList = HousesList;
    }
    public Community() {
    
    }

    public Community(String communityName, Long postalCode, String cityName, List<House> HousesList) {
        this.communityName = communityName;
        this.postalCode = postalCode;
        this.cityName = cityName;
        this.HousesList = HousesList;
    }
    
    public Community(String communityName, Long postalCode, String cityName) {
        this.communityName = communityName;
        this.postalCode = postalCode;
        this.cityName = cityName;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public Long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Long postalCode) {
        this.postalCode = postalCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
}
