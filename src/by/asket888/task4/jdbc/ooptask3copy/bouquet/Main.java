package by.asket888.java.task4.jdbc.ooptask3copy.bouquet;

import by.asket888.java.task4.jdbc.ooptask3copy.exceptions.HeadOopTaskException;
import by.asket888.java.task4.jdbc.ooptask3copy.exceptions.LessTwoLettersException;
import by.asket888.java.task4.jdbc.ooptask3copy.exceptions.MoreOneWordException;

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

            // catch all exception which could be thrown by called methods
        } catch (NullPointerException e) {
            System.err.println("Some flowers in bouquet have null name value");
            throw new HeadOopTaskException();
        } catch (IllegalArgumentException e) {
            System.err.println("Some flowers in bouquet have price value < 0");
            throw new HeadOopTaskException();
        } catch (LessTwoLettersException e) {
            System.err.println("This LessTwoLettersException was catch in Main method");
            throw new HeadOopTaskException();
        } catch (MoreOneWordException e) {
            System.err.println("This MoreOneWordException was catch in Main method");
            throw new HeadOopTaskException();
        }
    }
}
