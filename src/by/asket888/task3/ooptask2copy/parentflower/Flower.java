package by.asket888.java.task3.ooptask2copy.parentflower;

public abstract class Flower {

    private String flowerName;
    private double flowerPrice;

    public void setFlowerName(String flowerName){this.flowerName = flowerName;}
    public void setFlowerPrice(double flowerPrice) {this.flowerPrice = flowerPrice;}

    public String getFlowerName() {
        // 1) Add new built-in exception if set parameter has less value == null
        /* comment setFlowerName method of any flower from childflowers package and run class "Main"
         to check current exception working */
        if (flowerName == null) throw new NullPointerException();
        return flowerName;
    }

    public double getFlowerPrice() {
        // 2) Add new built-in exception if set parameter has value < 0
        /* add "-" to setFlowerPrice method's parameter of any flower from childflowers package and run class "Main"
         to check current exception working */
        if (flowerPrice < 0.0) throw new IllegalArgumentException();
        return flowerPrice;
    }
}
