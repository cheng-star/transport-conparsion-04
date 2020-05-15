package com.cwfit.user;

import com.cwfit.transport.Transport;

/**
 * @author yeyike
 * @date 2020/5/15 - 10:56
 */
public class Person {

    private int p_Age;
    private String p_Sex;
    private String id;
    private String p_Name;

    public Person() {
    }

    public Person(String describe) {
        System.out.println(describe);
    }

    public int getP_Age() {
        return p_Age;
    }

    public void setP_Age(int p_Age) {
        this.p_Age = p_Age;
    }

    public String getP_Sex() {
        return p_Sex;
    }

    public void setP_Sex(String p_Sex) {
        this.p_Sex = p_Sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getP_Name() {
        return p_Name;
    }

    public void setP_Name(String p_Name) {
        this.p_Name = p_Name;
    }

    public void driveTransport(Transport transport){
        System.out.println(transport.toString());
    }

    @Override
    public String toString() {
        return "Person{" +
                "p_Age=" + p_Age +
                ", p_Sex='" + p_Sex + '\'' +
                ", id='" + id + '\'' +
                ", p_Name='" + p_Name + '\'' +
                '}';
    }
}
