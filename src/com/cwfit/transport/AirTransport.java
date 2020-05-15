package com.cwfit.transport;

/**
 * @author yeyike
 * @date 2020/5/15 - 10:45
 */
public class AirTransport extends Transport{
    public AirTransport() {
    }

    public AirTransport(String describe) {
        super(describe);
    }

    @Override
    public void drivingMethod() {
        System.out.println("飞行");
    }

    @Override
    public void load() {

        System.out.println("空运");
    }

    @Override
    public void maintain() {

        System.out.println("检修");
    }

    @Override
    public void addGas() {

        System.out.println("空中同步加油机");
    }
}
