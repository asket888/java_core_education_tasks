package by.asket888.java.task2.oop.bouquet;

import java.util.Arrays;

/** TASK 2.1:
 *  Flower-girl. Determine flowers hierarchy. Create several flower objects. Gather a bouquet with its price
 *  determination */

public class Main {

    public static void main(String[] args) {

        // Create Bouquet Class object
        Bouquet bouquet = new Bouquet();
        // Create new variable with double type and set result of calculateBouquetPrice() method in it
        double bouquetPrice = bouquet.calculateBouquetPrice();
        // Create new variable with String type and set result of getBouquetFlowerNames() method in it
        String[] bouquetName = bouquet.getBouquetFlowerNames();

        // Print final result using values from both variables
        System.out.println("Our program just generated a perfect bouquet from " + bouquetName.length
                + " flowers \nLook! Best flowers in one place: \n" + Arrays.toString(bouquetName));
        System.out.println("");
        System.out.println("Only today the price for this excellent bouquet is "
                + bouquetPrice + " belorussian rubles");
    }
}
