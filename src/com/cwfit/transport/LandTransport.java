package com.cwfit.transport;

/**
 * @author yeyike
 * @date 2020/5/15 - 10:46
 */
public class LandTransport extends Transport{

    public LandTransport() {
    }

    public LandTransport(String describe) {
        super(describe);
    }

    @Override
    public void drivingMethod() {
        System.out.println("陆行");
    }

    @Override
    public void load() {

        System.out.println("陆运");
    }

    @Override
    public void maintain() {

        System.out.println("检修");
    }

    @Override
    public void addGas() {

        System.out.println("加油站");
    }
}
