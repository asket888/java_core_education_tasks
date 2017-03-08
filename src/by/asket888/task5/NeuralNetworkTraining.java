package by.asket888.java.task5;

import com.googlecode.fannj.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/** TASK 5.1 (EXTRA):
 *  Create and train neural network which will make one of action decisions if it meets one or more hoodlums in a dark alley.
 *  System should be aware:
 *  a) number of cigarettes available (integer value)
 *  b) play the violin or not (0 - no, 1 - yes). As a lifehack it's better not be able to play the violin if russian hooligans will ask
 *  c) number of hooligans (integer value)*/

public class NeuralNetworkTraining {

    public static void main(String[] args) {

        // Create set of layers for neural network
        List<Layer> layerList = new ArrayList<Layer>();
        // Create first neuron layer - input data neurons
        layerList.add(Layer.create(3, ActivationFunction.FANN_COS_SYMMETRIC, 0.01f));
        // Create second neuron layer - hidden layers
        layerList.add(Layer.create(17, ActivationFunction.FANN_SIGMOID_SYMMETRIC, 0.01f));
        // Create first neuron layer - output data neurons
        layerList.add(Layer.create(4, ActivationFunction.FANN_SIGMOID_SYMMETRIC, 0.01f));
        // Create neural network based on existed layers in layerList
        Fann fann = new Fann(layerList);

        // Create new trainer object
        Trainer trainer = new Trainer(fann);
        // Encapsulate training algorithm of neural network
        trainer.setTrainingAlgorithm(TrainingAlgorithm.FANN_TRAIN_RPROP);

        // Carry out neural network training using lessons from a 'train.data' file.
        // Set '10000' training cycles with each 100-th iteration report. Stop when average error is less than 0.00001
        trainer.train(new File("src/by/asket888/java/task5/train.data").getAbsolutePath(), 10000, 100, 0.00001f);
        // Save neural network result
        fann.save("src/by/asket888/java/task5/result.ann");
    }
}
