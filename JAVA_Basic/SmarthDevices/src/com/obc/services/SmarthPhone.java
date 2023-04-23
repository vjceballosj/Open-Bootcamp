package com.obc.services;

import com.obc.main.SmarthDevices;

public class SmarthPhone extends SmarthDevices {

    boolean camera;
    String mpxcamera;
    boolean bluetooth;
    InternalDevices internalDevices;
    public SmarthPhone() {
    }

    public SmarthPhone(boolean camera, String mpxcamera, boolean bluetooth, InternalDevices internalDevices) {
        this.camera = camera;
        this.mpxcamera = mpxcamera;
        this.bluetooth = bluetooth;
        this.internalDevices = internalDevices;
    }

    public boolean isCamera() {
        return camera;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }

    public String getMpxcamera() {
        return mpxcamera;
    }

    public void setMpxcamera(String mpxcamera) {
        this.mpxcamera = mpxcamera;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public InternalDevices getInternalDevices() {
        return internalDevices;
    }

    public void setInternalDevices(InternalDevices internalDevices) {
        this.internalDevices = internalDevices;
    }
}