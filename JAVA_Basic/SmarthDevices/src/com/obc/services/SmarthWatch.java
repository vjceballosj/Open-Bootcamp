package com.obc.services;

import com.obc.main.SmarthDevices;

public class SmarthWatch extends SmarthDevices {

    boolean waterresistant;
    String resistant;
    String belt;
    boolean called;
    String portcharge;
    InternalDevices internalDevices;
    public SmarthWatch() {
    }

    public SmarthWatch(boolean waterresistant, String resistant, String belt,
                       boolean called, String portcharge, InternalDevices internalDevices) {
        this.waterresistant = waterresistant;
        this.resistant = resistant;
        this.belt = belt;
        this.called = called;
        this.portcharge = portcharge;
        this.internalDevices = internalDevices;
    }

    public boolean isWaterresistant() {
        return waterresistant;
    }

    public void setWaterresistant(boolean waterresistant) {
        this.waterresistant = waterresistant;
    }

    public String getResistant() {
        return resistant;
    }

    public void setResistant(String resistant) {
        this.resistant = resistant;
    }

    public String getBelt() {
        return belt;
    }

    public void setBelt(String belt) {
        this.belt = belt;
    }

    public boolean isCalled() {
        return called;
    }

    public void setCalled(boolean called) {
        this.called = called;
    }

    public String getPortcharge() {
        return portcharge;
    }

    public void setPortcharge(String portcharge) {
        this.portcharge = portcharge;
    }

    public InternalDevices getInternalDevices() {
        return internalDevices;
    }

    public void setInternalDevices(InternalDevices internalDevices) {
        this.internalDevices = internalDevices;
    }
}

