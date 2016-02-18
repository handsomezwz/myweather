package com.zwz.android.myweather.model;

/**
 * Created by 伟洲 on 2016/2/18.
 */
public class City {
    private int id;
    private String cityName;
    private String cityCode;
    private int provinceId;

    //    id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //    cityName
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    //    cityCode
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }


    //    provinceId
    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
