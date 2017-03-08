package by.asket888.java.task3.ooptask2copy.childflowers;

import by.asket888.java.task3.iostreams.InputFlowerName;
import by.asket888.java.task3.ooptask2copy.parentflower.Flower;

import java.io.IOException;

public class ChildFlower_7 extends Flower {

    public ChildFlower_7() throws IOException {

        // Create an object of InputFlowerName class
        InputFlowerName inputFlowerName = new InputFlowerName();

        // set flower name as seventh element of array filled by flower names from .txt file
        setFlowerName(inputFlowerName.inputFlowerNameFromFile().get(6));
        setFlowerPrice(10.0);
    }
}
