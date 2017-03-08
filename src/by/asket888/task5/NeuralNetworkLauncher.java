package by.asket888.java.task5;

import com.googlecode.fannj.Fann;

public class NeuralNetworkLauncher {

    public static void main(String[] args) {

        // Read neural network from generated file
        Fann fann = new Fann("src/by/asket888/java/task5/result.ann");
        // Set test parameters
        // {number of cigarettes available, play the violin or not, quantity of Hooligans on your way}
        float[][] tests = {
                {20, 0, 2},
                {18, 1, 3},
                {0, 1, 0},
                {5, 1, 5},
        };
        // Print result processed by getAction() method
        for (float[] test:tests){
            System.out.println(getAction(fann.run(test)));
        }
    }

    public String setSituation(int cigarettesNum, int violinPlaying, int hooligansNum) {

        String text = new String();

        // Read neural network from generated file
        Fann fann = new Fann("src/by/asket888/java/task5/result.ann");
        // Set test parameters
        // {number of cigarettes available, play the violin or not, quantity of Hooligans on your way}
        float[][] tests = {
                {cigarettesNum, violinPlaying, hooligansNum},
        };
        // Print result processed by getAction() method
        for (float[] test:tests){
            text = getAction(fann.run(test));
        }
        return text;
    }

    // Create method to transform neural network choice into human understandable result
    private static String getAction(float[] out){
        int i = 0;
        for (int j = 1; j < 4; j++) {
            if(out[i]<out[j]){
                i = j;
            }
        }
        switch (i){
            case 0:return "Relax and go forward. Usually Hooligans don't hurt cool guys";
            case 1:return "Hide mobile to the bushes. If you're lucky will pick one up tomorrow";
            case 2:return "Run, Forrest, Run!";
            case 3:return "Nothing to afraid at all. Just watch your shadow";
        }
        return "";
    }
}
