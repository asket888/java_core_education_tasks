package by.asket888.java.task2.oop.bouquet;

import by.asket888.java.task2.oop.interfaces.BouquetProperties;
import by.asket888.java.task2.oop.parentflower.Flower;

import java.util.ArrayList;

// Create Class which extends class BouquetGenerator and implements interface BouquetProperties
public class Bouquet extends BouquetGenerator implements BouquetProperties {

    // Create new variable newGeneratedBouquet and set result of extended method generateRandomBouquet()
    private ArrayList<Flower> newGeneratedBouquet = generateRandomBouquet();

    // Override implemented interface method from interface BouquetProperties
    @Override
    public double calculateBouquetPrice() {

        // Create new variable for storing bouquet price calculation result
        double generatedBouquetPrice = 0.0;

        // Calculate all flowers from generated bouquet prices using foreach loop
        for (Flower elementNum: newGeneratedBouquet) {
            // One by one add all flower prices in generatedBouquetPrice variable
            generatedBouquetPrice += elementNum.getFlowerPrice();
        }
        // Call getBouquetFlowerNames() method for flower names definition
        getBouquetFlowerNames();

        // Return calculated bouquet price
        return generatedBouquetPrice;
    }

    @Override
    public String[] getBouquetFlowerNames() {
        // Create new variable for storing list of bouquet Flowers names
        String[] namesOfFlowersInBouquet = new String[newGeneratedBouquet.size()];

        // Add flower names from randomBouquet into String using for loop
        for (int j = 0; j < newGeneratedBouquet.size(); j++) {
            namesOfFlowersInBouquet[j] = newGeneratedBouquet.get(j).getFlowerName();
        }
        // Return arraylist with flower names
        return namesOfFlowersInBouquet;
    }
}
