package by.asket888.java.task2.oop.parentflower;

// Create parent abstract class
public abstract class Flower {

    // Create private fields
    private String flowerName;
    private double flowerPrice;

    // Create public "set" method for safety setting values to private fields
    public void setFlowerName(String flowerName){this.flowerName = flowerName;}
    public void setFlowerPrice(double flowerPrice) {this.flowerPrice = flowerPrice;}

    // Create public "get" method for safety getting values from private fields
    public String getFlowerName(){return flowerName;}
    public double getFlowerPrice(){return flowerPrice;}
}
