package by.asket888.java.task4.jdbc.ooptask3copy.parentflower;

public abstract class Flower {

    private String flowerName;
    private double flowerPrice;

    public void setFlowerName(String flowerName){this.flowerName = flowerName;}
    public void setFlowerPrice(double flowerPrice) {this.flowerPrice = flowerPrice;}

    public String getFlowerName() {
        if (flowerName == null) throw new NullPointerException();
        return flowerName;
    }

    public double getFlowerPrice() {
        if (flowerPrice < 0.0) throw new IllegalArgumentException();
        return flowerPrice;
    }
}
