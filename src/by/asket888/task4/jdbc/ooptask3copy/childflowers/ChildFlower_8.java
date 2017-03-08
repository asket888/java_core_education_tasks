package by.asket888.java.task4.jdbc.ooptask3copy.childflowers;

import by.asket888.java.task4.jdbc.ReadFlowerFromDb;
import by.asket888.java.task4.jdbc.ooptask3copy.parentflower.Flower;

import java.io.IOException;
import java.sql.SQLException;

public class ChildFlower_8 extends Flower {

    public ChildFlower_8() throws IOException, SQLException {

        // Create an object of ReadFlowerFromDb class
        ReadFlowerFromDb flowerFromDb = new ReadFlowerFromDb();

        // Set flower name as a result of selectFlowerName() method with input parameter "8"
        setFlowerName(flowerFromDb.selectFlowerName(8));
        // Set flower price as a result of selectFlowerPrice() method with input parameter "8"
        setFlowerPrice(flowerFromDb.selectFlowerPrice(8));
    }
}
