package com.epam.pashkov.task1;

/**
 * Created by Yaroslav on 22.04.2015.
 */
public class Motherboard extends Product {
    private String chipset;
    private String memory;
    private String storage;
    private String lan;
    private String usbPortVersion;

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getLan() {
        return lan;
    }

    public void setLan(String lan) {
        this.lan = lan;
    }

    public String getUsbPortVersion() {
        return usbPortVersion;
    }

    public void setUsbPortVersion(String usbPortVersion) {
        this.usbPortVersion = usbPortVersion;
    }

    public Motherboard() {
        super();
    }

    public Motherboard(String name, double price, String chipset, String memory, String storage, String lan, String usbPortVersion) {
        super(price, name);
        setChipset(chipset);
        setMemory(memory);
        setStorage(storage);
        setLan(lan);
        setUsbPortVersion(usbPortVersion);
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "price: " + price +
                ", name: " + name +
                ", chipset: " + chipset +
                ", memory: " + memory +
                ", storage: " + storage +
                ", lan: " + lan +
                ", usbPortVersion: " + usbPortVersion +
                '}';
    }
}
