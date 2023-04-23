package com.obc.main;

import com.obc.services.InternalDevices;
import com.obc.services.SmarthPhone;
import com.obc.services.SmarthWatch;

public class SmarthDevices {

    String marca;
    String pantalla;
    String battery;
    String resolution;
    String color;

    public static void main(String[] args) {

        InternalDevices coreWatchX = new InternalDevices("Androit", "2Gb",
                "256Mb","Fit","7.5");
        InternalDevices coreWatchH = new InternalDevices("Androit", "4Gb",
                "512Mb","Sport","9.1");
        InternalDevices corePhoneI = new InternalDevices("IOS", "128Gb",
                "3Gb","X12","6.1");
        InternalDevices corePhoneM = new InternalDevices("Androit", "64Gb",
                "4Gb","MotoG","7.3");

        SmarthWatch xiomiWatchSports = new SmarthWatch(false,"50mts",
                "Steel Strap",true,"Type C", coreWatchX);
        SmarthWatch huaweiWatchFit = new SmarthWatch(true,"100mts",
                "Rubber Strap",true,"Magnetic", coreWatchH);;
        SmarthPhone phoneIphone = new SmarthPhone(true,"64mpx",true,corePhoneI);
        SmarthPhone phoneMotorola = new SmarthPhone(true,"16mpx",true,corePhoneM);

        phoneMotorola.setCamera(false);

        System.out.println(xiomiWatchSports.isWaterresistant());
        System.out.println(huaweiWatchFit.getBelt());
        System.out.println(phoneIphone.isBluetooth());
        System.out.println(phoneMotorola.isCamera());

        //System.out.println("Hello world!");
    }
}