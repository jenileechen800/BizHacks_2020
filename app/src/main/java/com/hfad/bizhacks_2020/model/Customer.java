package main.java.com.hfad.bizhacks_2020.model;

import java.util.ArrayList;

public class Customer {

    protected int budget;
    protected int brandPref;
    protected int productType; // 0 = laptop
    protected int techKnowledge; // 1 = beginner, 2 = medium, 3 = advanced
    protected int userType; // 1 = student, 2 = home/personal, 3 = professional/work
    protected ArrayList<String> interestedBrands; // "Apple", "Lenovo", "Dell", "Asus"

    Customer(){
/*        productType = null;
        techKnowledge = null;
        userType = null;
        budget = 0;
        brandPref = 0;*/
    }

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    public int getTechKnowledge() {
        return techKnowledge;
    }

    public void setTechKnowledge(int techKnowledge) {
        this.techKnowledge = techKnowledge;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public ArrayList<String> getInterestedBrands() {
        return interestedBrands;
    }

    public void addInterestedBrands(ArrayList<String> brand) {
        for (String s : brand) {
            interestedBrands.add(s);
        }
    }

    public void removeInterestedBrands(String brand) {
        interestedBrands.remove(brand);
    }

}
