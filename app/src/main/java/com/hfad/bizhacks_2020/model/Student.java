package main.java.com.hfad.bizhacks_2020.model;

public class Student {

    enum OpSys {
        MAC,
        CHROME,
        WIN,
        LINUX
    }

    private boolean portability;
    private boolean noteTaking;
    private boolean batteryLife;
    private boolean affordability;
    OpSys opSys;

    Student(){
        portability = false;
        noteTaking = false;
        batteryLife = false;
        affordability = false;
        opSys = null;
    }

    public boolean isPortability() {
        return portability;
    }

    public void setPortability(boolean portability) {
        this.portability = portability;
    }

    public boolean isNoteTaking() {
        return noteTaking;
    }

    public void setNoteTaking(boolean noteTaking) {
        this.noteTaking = noteTaking;
    }

    public boolean isBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(boolean batteryLife) {
        this.batteryLife = batteryLife;
    }

    public boolean isAffordability() {
        return affordability;
    }

    public void setAffordability(boolean affordability) {
        this.affordability = affordability;
    }

    public OpSys isOpSys() {
        return opSys;
    }

    public void setOpSys(OpSys opSys) {
        this.opSys = opSys;
    }
}
