package by.asket888.java.task4.overallclass;

public abstract class OverallAbsClass {

    // Create abstract class fields which will extends by child Classes
    protected String flowerName;
    protected double flowerPrice;

    // Create abstract methods which will overrides by child Classes
    public abstract String selectFlowerName(int flowerId) throws Exception;
    public abstract double selectFlowerPrice(int flowerId) throws Exception;
}
