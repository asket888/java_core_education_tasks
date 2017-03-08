package by.asket888.java.task4.jdbc.ooptask3copy.childflowers;

import by.asket888.java.task4.jdbc.ReadFlowerFromDb;
import by.asket888.java.task4.jdbc.ooptask3copy.parentflower.Flower;

import java.io.IOException;
import java.sql.SQLException;

public class ChildFlower_2 extends Flower {

    public ChildFlower_2() throws IOException, SQLException {

        // Create an object of ReadFlowerFromDb class
        ReadFlowerFromDb flowerFromDb = new ReadFlowerFromDb();

        // Set flower name as a result of selectFlowerName() method with input parameter "2"
        setFlowerName(flowerFromDb.selectFlowerName(2));
        // Set flower price as a result of selectFlowerPrice() method with input parameter "2"
        setFlowerPrice(flowerFromDb.selectFlowerPrice(2));
    }
}
