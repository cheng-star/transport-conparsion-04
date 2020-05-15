package com.cwfit.transport;

/**
 * @author yeyike
 * @date 2020/5/15 - 10:47
 */
public class MaritimeMeansOfTransport extends Transport {
    public MaritimeMeansOfTransport() {
    }

    public MaritimeMeansOfTransport(String describe) {
        super(describe);
    }

    @Override
    public void drivingMethod() {
        System.out.println("航行");
    }

    @Override
    public void load() {

        System.out.println("水运");
    }

    @Override
    public void maintain() {

        System.out.println("检修");
    }

    @Override
    public void addGas() {

        System.out.println("锚地加油");
    }
}
