package by.asket888.java.task5;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;

public class HoodieAnalyserUISwing {

    public static void main(String arg[]) {

        final JFrame frame = new JFrame("AI Hooligan Analyser (AIHA)");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });

        // create first horizontal panel for cigarettes number input
        final Box numCigarettesBox = Box.createHorizontalBox();
        JLabel numCigarettesLabel = new JLabel("How many cigarettes do you have?");
        final JTextField numCigarettesField = new JTextField(2);
        numCigarettesBox.add(numCigarettesLabel);
        numCigarettesBox.add(Box.createHorizontalStrut(6));
        numCigarettesBox.add(numCigarettesField);

        // create second horizontal panel for input glasses choice
        Box violinPlayingBox = Box.createHorizontalBox();
        JLabel violinPlayingLabel = new JLabel("Do you play the violin?                  ");
        final JComboBox violinPlayingComboBox = new JComboBox<>(new String[] {"No", "Yes"});
        violinPlayingBox.add(violinPlayingLabel);
        violinPlayingBox.add(Box.createHorizontalStrut(6));
        violinPlayingBox.add(violinPlayingComboBox);

        // create third horizontal panel for hooligans number input
        Box numHooligansBox = Box.createHorizontalBox();
        JLabel numHooligansLabel = new JLabel("How many hooligans can you see? ");
        final JTextField numHooligansField = new JTextField(2);
        numHooligansBox.add(numHooligansLabel);
        numHooligansBox.add(Box.createHorizontalStrut(6));
        numHooligansBox.add(numHooligansField);

        // create fourth horizontal panel for buttons
        Box buttonsBox = Box.createHorizontalBox();
        final JButton acceptButton = new JButton("Ask AIHA");
        final JButton cancelButton = new JButton("Just thought");
        buttonsBox.add(Box.createHorizontalGlue());
        buttonsBox.add(acceptButton);
        buttonsBox.add(Box.createHorizontalStrut(12));
        buttonsBox.add(cancelButton);

        // set all panels on one vertical
        Box mainBox = Box.createVerticalBox();
        mainBox.setBorder(new EmptyBorder(12, 12, 12, 12));
        mainBox.add(numCigarettesBox);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(violinPlayingBox);
        mainBox.add(Box.createVerticalStrut(17));
        mainBox.add(numHooligansBox);
        mainBox.add(Box.createVerticalStrut(22));
        mainBox.add(buttonsBox);

        // set frame settings
        frame.setContentPane(mainBox);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);

        cancelButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        acceptButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int numCigarettesFieldValue, violinPlayingComboBoxValue , numHooligansFieldValue;
                numCigarettesFieldValue = Integer.parseInt(numCigarettesField.getText());

                if (violinPlayingComboBox.getSelectedItem().toString().equals("No")) {
                    violinPlayingComboBoxValue = 0;
                } else {
                    violinPlayingComboBoxValue = 1;
                }

                numHooligansFieldValue = Integer.parseInt(numHooligansField.getText());

                NeuralNetworkLauncher test = new NeuralNetworkLauncher();
                JOptionPane.showMessageDialog(acceptButton, test.setSituation(numCigarettesFieldValue,
                        violinPlayingComboBoxValue, numHooligansFieldValue), "AIHA's advice",
                        JOptionPane.WARNING_MESSAGE);

            }
        });
    }
}
