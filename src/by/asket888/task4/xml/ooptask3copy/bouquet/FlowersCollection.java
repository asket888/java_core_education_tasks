package by.asket888.java.task4.xml.ooptask3copy.bouquet;

import by.asket888.java.task4.xml.ooptask3copy.childflowers.*;
import by.asket888.java.task4.xml.ooptask3copy.parentflower.Flower;

import java.util.ArrayList;

public class FlowersCollection {

    public FlowersCollection() throws Exception {
    }

    private ChildFlower_1 childFlower1 = new ChildFlower_1();
    private ChildFlower_2 childFlower2 = new ChildFlower_2();
    private ChildFlower_3 childFlower3 = new ChildFlower_3();
    private ChildFlower_4 childFlower4 = new ChildFlower_4();
    private ChildFlower_5 childFlower5 = new ChildFlower_5();
    private ChildFlower_6 childFlower6 = new ChildFlower_6();
    private ChildFlower_7 childFlower7 = new ChildFlower_7();
    private ChildFlower_8 childFlower8 = new ChildFlower_8();

    private ArrayList<Flower> allFlowersCollection = new ArrayList<>();

    // 3) Check if objects have Flower type and add all of them into collection if it is true
    protected ArrayList<Flower> createAllFlowersCollection() throws ArrayStoreException {

        if (childFlower1 instanceof Flower & childFlower2 instanceof Flower & childFlower3 instanceof Flower
                & childFlower4 instanceof Flower & childFlower5 instanceof Flower & childFlower6 instanceof Flower
                & childFlower7 instanceof Flower & childFlower8 instanceof Flower) {

            allFlowersCollection.add(childFlower1);
            allFlowersCollection.add(childFlower2);
            allFlowersCollection.add(childFlower3);
            allFlowersCollection.add(childFlower4);
            allFlowersCollection.add(childFlower5);
            allFlowersCollection.add(childFlower6);
            allFlowersCollection.add(childFlower7);
            allFlowersCollection.add(childFlower8);
        }
        // if any object has non Flower type throw ArrayStoreException
        else {
            // throw will be catch in BouquetGenerator.generateRandomBouquet() before method result usage
            throw new ArrayStoreException();
        }
        return allFlowersCollection;
    }
}
