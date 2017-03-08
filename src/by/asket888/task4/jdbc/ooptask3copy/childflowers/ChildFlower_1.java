package by.asket888.java.task4.jdbc.ooptask3copy.childflowers;

import by.asket888.java.task4.jdbc.ReadFlowerFromDb;
import by.asket888.java.task4.jdbc.ooptask3copy.parentflower.Flower;

import java.io.IOException;
import java.sql.SQLException;

public class ChildFlower_1 extends Flower {

    public ChildFlower_1() throws IOException, SQLException {

        // Create an object of ReadFlowerFromDb class
        ReadFlowerFromDb flowerFromDb = new ReadFlowerFromDb();

        // Set flower name as a result of selectFlowerName() method with input parameter "1"
        setFlowerName(flowerFromDb.selectFlowerName(1));
        // Set flower price as a result of selectFlowerPrice() method with input parameter "1"
        setFlowerPrice(flowerFromDb.selectFlowerPrice(1));
    }
}
