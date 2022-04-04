package com.example.distination;

import java.io.Serializable;

public class Countries implements Serializable {
    private String countryName ;
    private String money ;
    private int image;
    private int map;
    private String baio ;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getMap() {
        return map;
    }

    public void setMap(int map) {
        this.map = map;
    }

    public String getBaio() {
        return baio;
    }

    public void setBaio(String baio) {
        this.baio = baio;
    }

    public Countries(String countryName, String money, int image, int map, String baio) {
        this.countryName = countryName;
        this.money = money;
        this.image = image;
        this.map = map;
        this.baio = baio;
    }
}
