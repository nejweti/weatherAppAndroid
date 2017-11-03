package com.nejat.customlistview;

/**
 * Created by user on 11/1/2017.
 */

public class DataModel {
    String city;
    String temp;

    public DataModel(String city, String temp) {
        this.city = city;
        this.temp = temp;
    }

    public String getCity() {
        return city;
    }

    public String getTemp() {
        return temp;
    }
}
