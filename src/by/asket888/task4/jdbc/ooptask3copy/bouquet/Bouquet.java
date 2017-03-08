package by.asket888.java.task4.jdbc.ooptask3copy.bouquet;

import by.asket888.java.task4.jdbc.ooptask3copy.interfaces.BouquetPriceCalculation;
import by.asket888.java.task4.jdbc.ooptask3copy.exceptions.LessTwoLettersException;
import by.asket888.java.task4.jdbc.ooptask3copy.exceptions.MoreOneWordException;
import by.asket888.java.task4.jdbc.ooptask3copy.parentflower.Flower;

import java.util.ArrayList;

public class Bouquet extends BouquetGenerator implements BouquetPriceCalculation {

    public Bouquet() throws Exception {
    }

    private ArrayList<Flower> newBouquet = generateRandomBouquet();

    @Override
    public double calculateBouquetPrice() throws Exception {

        double generatedBouquetPrice = 0.0;

        for (Flower elementNum: newBouquet) {
            // 7) Add new user-defined exception if length of flowerName in bouquet < 2
            /* Type less then 2 symbols in setFlowerName method's parameter of any flower from childflowers package
               and run class "Main" to check current exception working */
            if (elementNum.getFlowerName().length() < 2) {
                throw new LessTwoLettersException(elementNum.getFlowerName().length());
            }
            // 8) Add new user-defined exception if flowerName in bouquet consist of two words
            /* Type at least two words in setFlowerName method's parameter of any flower from childflowers package
               and run class "Main" to check current exception working */
            else if (elementNum.getFlowerName().contains(" ")) {
                throw new MoreOneWordException("Some flower's names in generated bouquet contains more then one word");
            }
            else {
                generatedBouquetPrice += elementNum.getFlowerPrice();
            }
        }
        getBouquetFlowerNames();
        return generatedBouquetPrice;
    }

    @Override
    public String[] getBouquetFlowerNames() throws Exception {

        String[] namesOfFlowersInBouquet = new String[newBouquet.size()];

        /* change "<" on "<=" below and run class "Main" to check exception #5 working */
        for (int j = 0; j < newBouquet.size(); j++) {
            // 5) Before array filling check if loop was created correctly
            if (j >= newBouquet.size()) {
                // if developer created mistake and type wrong comparison sign throw exception
                throw new IndexOutOfBoundsException("Code mistake in Class BouquetGenerator" +
                        " in namesOfFlowersInBouquet loop filling");
            }
            // if comparison sign is correct fill the array
            else {
                namesOfFlowersInBouquet[j] = newBouquet.get(j).getFlowerName();
            }
        }
        return namesOfFlowersInBouquet;
    }
}
