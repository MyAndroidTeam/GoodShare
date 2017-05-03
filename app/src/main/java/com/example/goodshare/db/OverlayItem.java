package com.example.goodshare.db;

import com.baidu.mapapi.model.inner.GeoPoint;

/**
 * Created by pc on 2017/5/3.
 */

public class OverlayItem {
    private GeoPoint geoPoint;
    private String a;
    private String b;

    public OverlayItem(GeoPoint geoPoint, String a, String b) {
        this.geoPoint = geoPoint;
        this.a = a;
        this.b = b;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public GeoPoint getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}
