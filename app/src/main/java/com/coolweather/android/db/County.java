package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lenovo on 2017/9/21.
 */

public class County extends DataSupport {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    private String countyName;
}
