package org.example;

public class Sedan extends Car{

    private String drives;
    private String engines;

    public String getDrives() {
        return drives;
    }

    public void setDrives(String drives) {
        this.drives = drives;
    }

    public String getEngines() {
        return engines;
    }

    public void setEngines(String engines) {
        this.engines = engines;
    }

    public String getInfo() {
        return "Model " + getModel() + " Sedan is " + getColor() + " in color and has a maximum speed of " + getMaxSpeed() + " km/h.";
    }

    public String drive() {
        return "Model " + getModel() + " Sedan has " + getDrives() + " drive.";
    }

    public String engine() {
        return "Model " + getModel() + " Sedan has " + getEngines() + " engine.";
    }

}
