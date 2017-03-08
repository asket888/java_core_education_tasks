package by.asket888.java.task4.jdbc.ooptask3copy.childflowers;

import by.asket888.java.task4.jdbc.ReadFlowerFromDb;
import by.asket888.java.task4.jdbc.ooptask3copy.parentflower.Flower;

import java.io.IOException;
import java.sql.SQLException;

public class ChildFlower_7 extends Flower {

    public ChildFlower_7() throws IOException, SQLException {

        // Create an object of ReadFlowerFromDb class
        ReadFlowerFromDb flowerFromDb = new ReadFlowerFromDb();

        // Set flower name as a result of selectFlowerName() method with input parameter "7"
        setFlowerName(flowerFromDb.selectFlowerName(7));
        // Set flower price as a result of selectFlowerPrice() method with input parameter "7"
        setFlowerPrice(flowerFromDb.selectFlowerPrice(7));
    }
}
