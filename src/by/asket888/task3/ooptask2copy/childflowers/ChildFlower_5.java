package by.asket888.java.task3.ooptask2copy.childflowers;

import by.asket888.java.task3.iostreams.InputFlowerName;
import by.asket888.java.task3.ooptask2copy.parentflower.Flower;

import java.io.IOException;

public class ChildFlower_5 extends Flower {

    public ChildFlower_5() throws IOException {

        // Create an object of InputFlowerName class
        InputFlowerName inputFlowerName = new InputFlowerName();

        // set flower name as fifth element of array filled by flower names from .txt file
        setFlowerName(inputFlowerName.inputFlowerNameFromFile().get(4));
        setFlowerPrice(20.0);
    }
}
