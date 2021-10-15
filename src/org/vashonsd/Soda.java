package org.vashonsd;

public class Soda {
    double price;
    String description;
    String brandName;
    int ounces;

    public Soda(double thePrice, String theDescription, String theBrandName, int theOunces) {
        price = thePrice;
        description = theDescription;
        brandName = theBrandName;
        ounces = theOunces;
    }

    public double getPrice() {
        return price + ounces * .0175;
    }

    @Override
    public String toString() {
        return "Soda{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", brandName='" + brandName + '\'' +
                ", ounces=" + ounces +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getOunces() {
        return ounces;
    }

    public void setOunces(int ounces) {
        this.ounces = ounces;
    }
}
