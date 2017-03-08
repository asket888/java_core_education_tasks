package by.asket888.java.task3.ooptask2copy.childflowers;

import by.asket888.java.task3.iostreams.InputFlowerName;
import by.asket888.java.task3.ooptask2copy.parentflower.Flower;

import java.io.IOException;

public class ChildFlower_2 extends Flower {

    public ChildFlower_2() throws IOException {

        // Create an object of InputFlowerName class
        InputFlowerName inputFlowerName = new InputFlowerName();

        // set flower name as second element of array filled by flower names from .txt file
        setFlowerName(inputFlowerName.inputFlowerNameFromFile().get(1));
        setFlowerPrice(7.5);
    }
}
