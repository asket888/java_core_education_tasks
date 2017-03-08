package by.asket888.java.task4.xml.ooptask3copy.childflowers;

import by.asket888.java.task4.xml.ReadFlowerFromXml;
import by.asket888.java.task4.xml.ooptask3copy.parentflower.Flower;

public class ChildFlower_8 extends Flower {

    public ChildFlower_8() throws Exception {

        // Create an object of ReadFlowerFromXml class
        ReadFlowerFromXml flowerFromXml = new ReadFlowerFromXml();

        // Set flower name as a result of selectFlowerName() method with input parameter "7"
        setFlowerName(flowerFromXml.selectFlowerName(7));
        // Set flower price as a result of selectFlowerName() method with input parameter "7"
        setFlowerPrice(flowerFromXml.selectFlowerPrice(7));
    }
}
