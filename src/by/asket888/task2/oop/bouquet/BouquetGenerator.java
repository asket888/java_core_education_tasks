package by.asket888.java.task2.oop.bouquet;

import by.asket888.java.task2.oop.parentflower.Flower;
import by.asket888.java.task2.oop.interfaces.BouquetGeneration;

import java.util.ArrayList;

// Create Class which extends class FlowersCollection and implements interface BouquetGeneration
public class BouquetGenerator extends FlowersCollection implements BouquetGeneration {

    // Create new variable newAllFlowersCollection and set result of extended method createAllFlowersCollection() in it
    private ArrayList<Flower> newAllFlowersCollection = createAllFlowersCollection();

    // Create new ArrayList collection with Flower element type for storing flowers from generated bouquet
    private ArrayList<Flower> randomBouquetCollection = new ArrayList<>();

    // Override implemented method from interface BouquetGeneration
    @Override
    public ArrayList<Flower> generateRandomBouquet() {

        // Create new random variable which will generate number of flowers in bouquet (from 3 to 7 pcs)
        int numberOfFlowersInBouquet = (int) (Math.random() * ((7 - 3) + 1) + 3);

        // Add random Child Flowers from newAllFlowersCollection into randomBouquetCollection using for loop
        for (int i = 0; i < numberOfFlowersInBouquet; i++) {
            // Generate new variable which will generate random element number in newAllFlowersCollection
            int randomElement = (int) (Math.random() * 8);
            // Add element from newAllFlowersCollection with randomElement number into randomBouquetCollection
            randomBouquetCollection.add(newAllFlowersCollection.get(randomElement));
        }

        // Return generated collection with picked flowers in it
        return randomBouquetCollection;
    }
}
