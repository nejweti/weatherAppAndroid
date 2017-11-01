package com.nejat.customlistview;

/**
 * Created by user on 11/1/2017.
 */

public class DataModel {
    String city;
    String Temp;

    public DataModel(String city, String temp) {
        this.city = city;
        Temp = temp;
    }

    public String getCity() {
        return city;
    }

    public String getTemp() {
        return Temp;
    }
}
