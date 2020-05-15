package com.cwfit.apply;

import com.cwfit.transport.impl.air.Airship;
import com.cwfit.user.Person;

import java.sql.Statement;
import java.util.Date;

/**
 * @author yeyike
 * @date 2020/5/15 - 11:03
 */
public class Apply {

    public static void main(String[]args){
        Person person = new Person("一位律师");
        Airship airship = new Airship("飞船的框架是用轻而坚固的金属制成的。");

        person.setP_Sex("男");
        person.setP_Name("Jonafy");
        person.setP_Age(32);
        person.setId("009");

        Date date = new Date();
        airship.setDateOfPurchase(date);
        airship.setGPSPosition("beijing");
        airship.setId("020");
        airship.setOwnership("Jonafy");

        System.out.println(person.toString());
        person.driveTransport(airship);

    }
}
