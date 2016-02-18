package com.zwz.android.myweather.model;

/**
 * Created by 伟洲 on 2016/2/18.
 */
public class County {
    private int id;
    private String countyName;
    private String countyCode;
    private int cityId;

    /*
    * id
    * */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*
    * countyName
    * */
    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    /*
    * countyCode
    * */
    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }


    /*
    * cityId
    * */

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getCityId() {
        return cityId;
    }
}

