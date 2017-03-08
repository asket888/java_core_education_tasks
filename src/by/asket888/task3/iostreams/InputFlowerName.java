package by.asket888.java.task3.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/** TASK 3.2:
 *  Add data reading from file using Input Stream */

public class InputFlowerName {

    public ArrayList<String> inputFlowerNameFromFile() throws IOException {

        // Use BufferReader through FileReader to read information from .txt file
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/by/asket888/java/task3/" +
                "iostreams/iotxtfiles/FlowerNameInput.txt"));

        // Create new ArrayList for storing one by one all .txt file lines as String elements
        ArrayList<String> array = new ArrayList<>();
        String[] list = new String[8];

        // Read all .txt file lines one by one
        try {
            // Set read file's line into String variable flowerFromFile
            String flowerFromFile = bufferedReader.readLine();
            // Create loop which will stop on first empty file's line
            while (flowerFromFile != null) {
                // Add all String variables as elements to the array
                array.add(flowerFromFile);
                flowerFromFile = bufferedReader.readLine();
            }
        } finally {
            // Close BufferReader after all file's line will be added to the array
            bufferedReader.close();
        }
        // return filled array to use result in child flowers classes
        return array;
    }

    public ArrayList<String> inputFlowerPriceFromFile() throws IOException {

        // Use BufferReader through FileReader to read information from .txt file
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/by/epam/cdp/automation/java/task3/" +
                "iostreams/iotxtfiles/FlowerNameInput.txt"));

        // Create new ArrayList for storing one by one all .txt file lines as String elements
        ArrayList<String> array = new ArrayList<>();

        // Read all .txt file lines one by one
        try {
            // Set read file's line into String variable flowerFromFile
            String flowerFromFile = bufferedReader.readLine();
            // Create loop which will stop on first empty file's line
            while (flowerFromFile != null) {
                // Add all String variables as elements to the array
                array.add(flowerFromFile);
                flowerFromFile = bufferedReader.readLine();
            }
        } finally {
            // Close BufferReader after all file's line will be added to the array
            bufferedReader.close();
        }
        // return filled array to use result in child flowers classes
        return array;
    }
}
