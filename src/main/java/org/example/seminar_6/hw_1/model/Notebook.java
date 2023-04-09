package org.example.seminar_6.hw_1.model;

import java.awt.*;
import java.util.HashMap;

public class Notebook {
    private String name;
    private int ramSize;
    private String osName;
    private int hddSize;
    private String color;

    public Notebook(String name, int ramSize, String osName, int hddSize, String color) {
        this.name = name;
        this.ramSize = ramSize;
        this.osName = osName;
        this.hddSize = hddSize;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "name='" + name + '\'' +
                ", ramSize=" + ramSize +
                ", osName='" + osName + '\'' +
                ", hddSize=" + hddSize +
                ", color='" + color + '\'' +
                '}';
    }
}
