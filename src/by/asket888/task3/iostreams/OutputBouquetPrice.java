package by.asket888.java.task3.iostreams;

import by.asket888.java.task3.ooptask2copy.bouquet.Bouquet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/** TASK 3.2:
 *  Add data writing to file using Output Stream */

public class OutputBouquetPrice {

    // Check if BouquetOutput.txt file is already exist and create new one only if result is 'false'
    private void checkFileExist() throws IOException {

        File file = new File("src/by/asket888/automation/java/task3/iostreams/iotxtfiles/BouquetOutput.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    private void outputBouquetPriceInFile () throws Exception {

        Bouquet bouquet = new Bouquet();

        // Call checkFileExist() before working with a file
        checkFileExist();

        // Use PrintWriter through FileWriter to write information to .txt file
        PrintWriter printWriter = new PrintWriter(new FileWriter("src/by/epam/cdp/automation/java/task3/" +
                "iostreams/iotxtfiles/BouquetOutput.txt"));
        try {
            // Write result of bouquet object methods in .txt file
            printWriter.println("Our program just generated a perfect bouquet from " +
                    bouquet.getBouquetFlowerNames().length + " flowers \nLook! Best flowers in one place: \n"
                    + Arrays.toString(bouquet.getBouquetFlowerNames()));
            printWriter.println("");
            printWriter.println("Only today the price for this excellent bouquet is "
                    + bouquet.calculateBouquetPrice() + " belorussian rubles");
        } finally {
            // Close PrintWriter after all file's line will be added to the array
            printWriter.close();
        }
    }

    // Use main method for output result in .txt file
    public static void main(String[] args) throws Exception {

        OutputBouquetPrice outputBouquetPrice = new OutputBouquetPrice();
        outputBouquetPrice.outputBouquetPriceInFile();
        System.out.println("Your bouquet was added to \"BouquetOutput.txt\" file. Check your file please");
    }
}
