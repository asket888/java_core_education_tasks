package by.asket888.java.task3.ooptask2copy.bouquet;

import by.asket888.java.task3.ooptask2copy.interfaces.RandBouquetGeneration;
import by.asket888.java.task3.exceptions.OopTaskMainException;
import by.asket888.java.task3.ooptask2copy.parentflower.Flower;

import java.util.ArrayList;

public class BouquetGenerator extends FlowersCollection implements RandBouquetGeneration {

    @Override
    public ArrayList<Flower> generateRandomBouquet() throws Exception {

        ArrayList<Flower> newAllFlowersCollection = createAllFlowersCollection();
        ArrayList<Flower> randomBouquetCollection = new ArrayList<>();

        try {
            createAllFlowersCollection();
            // 3) Catch exception # 3 and print information about it to console
        } catch (ArrayStoreException e) {
            System.err.println("At least one element in allFlowersCollection is not Flower type");
            throw new OopTaskMainException();
        }

        /* change minimum and maximum quantity of flowers in bouquet below and run class "Main"
           to check exception #4 working */
        int numberOfFlowersInBouquet = (int) (Math.random() * ((7 - 3) + 1) + 3);
        for (int i = 0; i < numberOfFlowersInBouquet; i++) {
            // 4) Before collection filling check if loop was created correctly
            if (numberOfFlowersInBouquet < 3 || numberOfFlowersInBouquet > 7) {
                // if developer created mistake and type wrong numbers in numberOfFlowersInBouquet formula
                // throw exception
                throw new IllegalArgumentException("Code mistake in Class BouquetGenerator" +
                        " in numberOfFlowersInBouquet calculation. current value of numberOfFlowersInBouquet = "
                        + numberOfFlowersInBouquet + " instead [3, 7]");
            }
            // if formula is correct fill the array
            else {
                int randomElementFromFlowerCollectionNum = (int) (Math.random() * 8);
                randomBouquetCollection.add(newAllFlowersCollection.get(randomElementFromFlowerCollectionNum));
            }
        }
        return randomBouquetCollection;
    }
}

