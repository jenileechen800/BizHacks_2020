package main.java.com.hfad.bizhacks_2020.model;

public class Personal {
    private boolean portability;
    private boolean noteTaking;
    private boolean batteryLife;
    private boolean affordability;
    private int opSys;
    private boolean graphics;
    private boolean speed;
    private boolean screenSize;
    private boolean numberPad;
    private boolean touchScreen;
    private boolean memory;

    Personal(){
        portability = false;
        noteTaking = false;
        batteryLife = false;
        affordability = false;
        opSys = 0;
        graphics = false;
        speed = false;
        screenSize = false;
        numberPad = false;
        touchScreen = false;
        memory = false;
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

    public int getOpSys() {
        return opSys;
    }

    public void setOpSys(int opSys) {
        this.opSys = opSys;
    }

    public boolean isGraphics() {
        return graphics;
    }

    public void setGraphics(boolean graphics) {
        this.graphics = graphics;
    }

    public boolean isSpeed() {
        return speed;
    }

    public void setSpeed(boolean speed) {
        this.speed = speed;
    }

    public boolean isScreenSize() {
        return screenSize;
    }

    public void setScreenSize(boolean screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isNumberPad() {
        return numberPad;
    }

    public void setNumberPad(boolean numberPad) {
        this.numberPad = numberPad;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public boolean isMemory() {
        return memory;
    }

    public void setMemory(boolean memory) {
        this.memory = memory;
    }


}
