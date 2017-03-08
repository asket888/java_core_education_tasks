package by.asket888.java.task4.xml.ooptask3copy.childflowers;

import by.asket888.java.task4.xml.ReadFlowerFromXml;
import by.asket888.java.task4.xml.ooptask3copy.parentflower.Flower;

public class ChildFlower_1 extends Flower {

    public ChildFlower_1() throws Exception {

        // Create an object of ReadFlowerFromXml class
        ReadFlowerFromXml flowerFromXml = new ReadFlowerFromXml();

        // Set flower name as a result of selectFlowerName() method with input parameter "0"
        setFlowerName(flowerFromXml.selectFlowerName(0));
        // Set flower price as a result of selectFlowerName() method with input parameter "0"
        setFlowerPrice(flowerFromXml.selectFlowerPrice(0));
    }
}
