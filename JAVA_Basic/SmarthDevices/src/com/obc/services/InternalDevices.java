package com.obc.services;

public class InternalDevices {
    String so;
    String rom;
    String ram;
    String model;
    String coreVersion;

    public InternalDevices() {
    }

    public InternalDevices(String so, String rom, String ram, String model, String coreVersion) {
        this.so = so;
        this.rom = rom;
        this.ram = ram;
        this.model = model;
        this.coreVersion = coreVersion;
    }
}
