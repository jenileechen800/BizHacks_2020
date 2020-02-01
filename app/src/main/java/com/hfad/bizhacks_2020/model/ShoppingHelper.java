package main.java.com.hfad.bizhacks_2020.model;

import java.util.ArrayList;

public class ShoppingHelper {
    private Customer customer;
    private Laptop MSI_GS75, ASUS_Zephyrus_M;
    private ArrayList<Laptop> laptops;

    public static void main(java.lang.String[] args) {
        setCustomerPreferences(0, 900, 1, 2, "Lenovo");
    }

    public void setCustomerPreferences(int productType, int budget, int techKnowledge,
                                       int userType, ArrayList<String> interestedBrands) {
        customer.setProductType(productType);
        customer.setBudget(budget);
        customer.setTechKnowledge(techKnowledge);
        customer.setUserType(userType);
        customer.addInterestedBrands(interestedBrands);
    }

    public void getResults() {

    }

}
