package main.java.com.hfad.bizhacks_2020.model;

public class Product {
    protected double price;
    protected String beginnerDesc;
    protected String interDesc;
    protected String advancedDesc;

    public String getBeginnerDesc() {
        return beginnerDesc;
    }

    public void setBeginnerDesc(String beginnerDesc) {
        this.beginnerDesc = beginnerDesc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInterDesc() {
        return interDesc;
    }

    public void setInterDesc(String interDesc) {
        this.interDesc = interDesc;
    }

    public String getAdvancedDesc() {
        return advancedDesc;
    }

    public void setAdvancedDesc(String advancedDesc) {
        this.advancedDesc = advancedDesc;
    }


}
