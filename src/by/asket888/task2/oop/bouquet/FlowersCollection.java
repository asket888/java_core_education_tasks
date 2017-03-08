package by.asket888.java.task2.oop.bouquet;

import by.asket888.java.task2.oop.childflowers.*;
import by.asket888.java.task2.oop.parentflower.Flower;

import java.util.ArrayList;

// Create class which will add all Child Flowers into ArrayList collection
public class FlowersCollection {

    // One by one create all Child Flower Classes objects
    private Alstromeria alstromeria = new Alstromeria();
    private Carnation carnation = new Carnation();
    private Eustoma eustoma = new Eustoma();
    private Gerbera gerbera = new Gerbera();
    private Orchid orchid = new Orchid();
    private Peony peony = new Peony();
    private Rose rose = new Rose();
    private Tulip tulip = new Tulip();

    // Create new ArrayList collection with Flower type of element
    private ArrayList<Flower> allFlowersCollection = new ArrayList<>();

    // Create protected method to add all Child Flowers Objects to collection
    protected ArrayList<Flower> createAllFlowersCollection() {

        // One by one add Child Flowers Objects to created collection
        allFlowersCollection.add(alstromeria);
        allFlowersCollection.add(carnation);
        allFlowersCollection.add(eustoma);
        allFlowersCollection.add(gerbera);
        allFlowersCollection.add(orchid);
        allFlowersCollection.add(peony);
        allFlowersCollection.add(rose);
        allFlowersCollection.add(tulip);

        // Return collection with flowers object as method result
        return allFlowersCollection;
    }
}
