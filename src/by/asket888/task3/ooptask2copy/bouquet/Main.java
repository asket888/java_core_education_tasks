package by.asket888.java.task3.ooptask2copy.bouquet;

import by.asket888.java.task3.exceptions.MoreOneWordException;
import by.asket888.java.task3.exceptions.OopTaskMainException;
import by.asket888.java.task3.exceptions.LessTwoLettersException;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        Bouquet bouquet = new Bouquet();

        // try all program result printing
        try {
            double bouquetPrice = bouquet.calculateBouquetPrice();
            String[] bouquetName = bouquet.getBouquetFlowerNames();
            System.out.println("Our program just generated a perfect bouquet from " + bouquetName.length
                    + " flowers \nLook! Best flowers in one place: \n" + Arrays.toString(bouquetName));
            System.out.println("");
            System.out.println("Only today the price for this excellent bouquet is "
                    + bouquetPrice + " belorussian rubles");

            // One by one catch all exception which could be thrown by called methods
        } catch (NullPointerException e) {
            System.err.println("Some flowers in bouquet have null name value");
            throw new OopTaskMainException();
        } catch (IllegalArgumentException e) {
            System.err.println("Some flowers in bouquet have price value < 0");
            throw new OopTaskMainException();
        } catch (LessTwoLettersException e) {
            System.err.println("This LessTwoLettersException was catch in Main method");
            throw new OopTaskMainException();
        } catch (MoreOneWordException e) {
            System.err.println("This MoreOneWordException was catch in Main method");
            throw new OopTaskMainException();
        }
    }
}
