package by.asket888.java.task4.jdbc.ooptask3copy.childflowers;

import by.asket888.java.task4.jdbc.ReadFlowerFromDb;
import by.asket888.java.task4.jdbc.ooptask3copy.parentflower.Flower;

import java.io.IOException;
import java.sql.SQLException;

public class ChildFlower_3 extends Flower {

    public ChildFlower_3() throws IOException, SQLException {

        // Create an object of ReadFlowerFromDb class
        ReadFlowerFromDb flowerFromDb = new ReadFlowerFromDb();

        // Set flower name as a result of selectFlowerName() method with input parameter "3"
        setFlowerName(flowerFromDb.selectFlowerName(3));
        // Set flower price as a result of selectFlowerPrice() method with input parameter "3"
        setFlowerPrice(flowerFromDb.selectFlowerPrice(3));
    }
}
