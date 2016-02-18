package com.zwz.android.myweather.model;

/**
 * Created by 伟洲 on 2016/2/18.
 */
public class Province {
    private int id;
    private String provinceName;
    private String provinceCode;


    //    id
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    //    provinceName
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    //    provinceCode
    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
}
