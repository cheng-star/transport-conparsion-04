package com.cwfit.transport;

import java.util.Date;

/**
 * @author yeyike
 * @date 2020/5/15 - 10:40
 */
public abstract class Transport {

    private String ownership;
    private String GPSPosition;
    private String price;
    private Date dateOfPurchase;
    private String id;

    public Transport() {
    }

    public Transport(String describe) {

        System.out.println(describe);
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getGPSPosition() {
        return GPSPosition;
    }

    public void setGPSPosition(String GPSPosition) {
        this.GPSPosition = GPSPosition;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void drivingMethod();
    public abstract void load();
    public abstract void maintain();
    public abstract void addGas();


    @Override
    public String toString() {
        return "Transport{" +
                "ownership='" + ownership + '\'' +
                ", GPSPosition='" + GPSPosition + '\'' +
                ", price='" + price + '\'' +
                ", dateOfPurchase=" + dateOfPurchase +
                ", id='" + id + '\'' +
                '}';
    }
}
