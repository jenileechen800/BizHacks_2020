package main.java.com.hfad.bizhacks_2020.model;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingHelper {
    private static Customer customer = new Customer();

    public static Laptop MSI_GS75 = new Laptop(/*add here*/);
    public static Laptop ASUS_Zephyrus_M = new Laptop(/*add here*/);

    public ArrayList<Laptop> laptops;

    public ShoppingHelper(int productType, int budget, int techKnowledge,
                          int userType, ArrayList<String> interestedBrands) {
        setCustomerPreferences(productType, budget, techKnowledge, userType, interestedBrands);
        selectAttributes();
        getResults();
    }

    public void setCustomerPreferences(int productType, int budget, int techKnowledge,
                                       int userType, ArrayList<String> interestedBrands) {
        customer.setProductType(productType);
        customer.setBudget(budget);
        customer.setTechKnowledge(techKnowledge);
        customer.setUserType(userType);
        customer.addInterestedBrands(interestedBrands);
    }

    protected int productType; // 0 = laptop
    protected int techKnowledge; // 1 = beginner, 2 = medium, 3 = advanced
    protected int userType; // 1 = student, 2 = home/personal, 3 = professional/work
    protected ArrayList<String> interestedBrands; // "Apple", "Lenovo", "Dell", "Asus"

    public void selectAttributes() {
        switch (customer.getTechKnowledge()) {
            case 1: // if user is beginner, show only
                break;
            case 2:
                break;
            default:

        }
    }

    public ArrayList<Laptop> getResults() {
        ArrayList<Laptop> results = new ArrayList<Laptop>();
        for (Laptop laptop : laptops) {
            if (customer.getBudget() <= customer.budget) {
                // filters
                results.add(laptop);
            }
        }
        sortResults(results);

        return (ArrayList<Laptop>) results.subList(0, 3);
    }

    public void sortResults(ArrayList<Laptop> laptops) {
    }


    public static void main(java.lang.String[] args) {
        new ShoppingHelper(0, 900, 1, 2, (ArrayList<String>) Arrays.asList("Lenovo"));
    }

}
