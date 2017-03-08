package by.asket888.java.task4.xml.ooptask3copy.childflowers;

import by.asket888.java.task4.xml.ReadFlowerFromXml;
import by.asket888.java.task4.xml.ooptask3copy.parentflower.Flower;

public class ChildFlower_2 extends Flower {

    public ChildFlower_2() throws Exception {

        // Create an object of ReadFlowerFromXml class
        ReadFlowerFromXml flowerFromXml = new ReadFlowerFromXml();

        // Set flower name as a result of selectFlowerName() method with input parameter "1"
        setFlowerName(flowerFromXml.selectFlowerName(1));
        // Set flower price as a result of selectFlowerName() method with input parameter "1"
        setFlowerPrice(flowerFromXml.selectFlowerPrice(1));
    }
}
