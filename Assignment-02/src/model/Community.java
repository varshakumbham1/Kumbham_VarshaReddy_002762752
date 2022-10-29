package model;
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
    private Long zipcode;
    private String cityName;

    public Community() {
    }

    public Community(String communityName, Long zipcode, String cityName) {
        this.communityName = communityName;
        this.zipcode = zipcode;
        this.cityName = cityName;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public Long getZipcode() {
        return zipcode;
    }

    public void setZipCode(Long zipcode) {
        this.zipcode = zipcode;
    } 
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
