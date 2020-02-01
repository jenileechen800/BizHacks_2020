public class Customer {
    enum ProductType {
        LAPTOP,
        CELLPHONE,
        HEADPHONE,
        CAMERA,
        TV,
        VIDEOGAMES,
        PRINTERS,
        APPLIANCES
    }
    enum TechKnowledge {
        BEGINNER,
        MEDIUM,
        ADVANCED
    }
    enum UserType {
        STUDENT,
        PERSONAL,
        PROFESSIONAL
    }
    protected double budget;
    protected int brandPref;
    ProductType productType;
    TechKnowledge techKnowledge;
    UserType userType;

    Customer(){
        productType = null;
        techKnowledge = null;
        userType = null;
        budget = 0;
        brandPref = 0;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public TechKnowledge getTechKnowledge() {
        return techKnowledge;
    }

    public void setTechKnowledge(TechKnowledge techKnowledge) {
        this.techKnowledge = techKnowledge;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public int getBrandPref() {
        return brandPref;
    }

    public void setBrandPref(int brandPref) {
        this.brandPref = brandPref;
    }



}
