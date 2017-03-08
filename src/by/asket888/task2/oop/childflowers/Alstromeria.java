package by.asket888.java.task2.oop.childflowers;

import by.asket888.java.task2.oop.parentflower.Flower;

// Create Class which extends parameters of Parent Class Flower
public class Alstromeria extends Flower {

    // Create Class constructor which assign unique parameters to extended from Parent Class fields
    /* It's better to use constructor then method in this situation because method should be declared for running
     when constructor will run right after creation an object. So we need just create an object for parameters
      setting */
    public Alstromeria() {
        setFlowerName("Alstromeria");
        setFlowerPrice(13.5);
    }
}
