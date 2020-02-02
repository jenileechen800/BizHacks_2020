package main.java.com.hfad.bizhacks_2020.model;

public class Laptop extends Product {

    enum OpSys {
        MAC,
        CHROME,
        WIN,
        LINUX
    }

    private boolean graphics, speed, batteryLife, portability, touchScreen, price, memory, notetaking, smallScreen, largeScreen, numberPad, isDisplayed;
    OpSys opSys;

    Laptop(){
        isDisplayed = false;
        graphics = false;
        speed = false;
        batteryLife = false;
        portability = false;
        touchScreen = false;
        opSys = null;
        price = false;
        memory = false;
        notetaking = false;
        smallScreen = false;
        largeScreen = false;
        numberPad = false;
    }

    public boolean graphics() {
        return graphics;
    }

    public void setDisplay(boolean display) {
        this.graphics = display;
    }

    public boolean isSpeed() {
        return speed;
    }

    public void setSpeed(boolean speed) {
        this.speed = speed;
    }

    public boolean isBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(boolean batteryLife) {
        this.batteryLife = batteryLife;
    }

    public boolean isPortability() {
        return portability;
    }

    public void setPortability(boolean portability) {
        this.portability = portability;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public OpSys isOpSys() {
        return opSys;
    }

    public void setOpSys(OpSys opSys) {
        this.opSys = opSys;
    }

    public boolean isPrice() {
        return price;
    }

    public void setPrice(boolean price) {
        this.price = price;
    }

    public boolean isMemory() {
        return memory;
    }

    public void setMemory(boolean memory) {
        this.memory = memory;
    }

    public boolean isNotetaking() {
        return notetaking;
    }

    public void setNotetaking(boolean notetaking) {
        this.notetaking = notetaking;
    }

    public boolean isSmallScreen() {
        return smallScreen;
    }

    public void setSmallScreen(boolean smallScreen) {
        this.smallScreen = smallScreen;
    }

    public boolean isLargeScreen() {
        return largeScreen;
    }

    public void setLargeScreen(boolean largeScreen) {
        this.largeScreen = largeScreen;
    }

    public boolean isNumberPad() {
        return numberPad;
    }

    public void setNumberPad(boolean numberPad) {
        this.numberPad = numberPad;
    }

    public boolean isDisplayed() {
        return isDisplayed;
    }

    public void setDisplayed(boolean displayed) {
        isDisplayed = displayed;
    }


}
