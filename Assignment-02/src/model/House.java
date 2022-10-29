/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author devikaboddu
 */
public class House {
    private String HouseNo;
    private String cityName;
    private String communityName;
    private Long postalCode;



    public House() {
    }

    public House(String HouseNo, String cityName, String communityName, Long postalCode) {
        this.HouseNo = HouseNo;
        this.cityName = cityName;
        this.communityName = communityName;
        this.postalCode = postalCode;
    }

    public String getHouseNo() {
        return HouseNo;
    }

    public void setHouseNo(String HouseNo) {
        this.HouseNo = HouseNo;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
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
}
