package by.asket888.java.task1.calculator;

import java.util.Scanner;

/** TASK 1.1:
 *  Compose simple calculator (realise at least 4 operations: addition, subtraction, multiplication, division)*/

public class ConsoleCalculator {

    public static void main(String[] args) {

        // Application greeting
        System.out.println("WELCOME TO OUR CALCULATOR");
        System.out.println("Here you can add, subtract, multiply and divide integers and fractional numbers");
        System.out.println("*****************************************************************************");

        // First number input algorithm with user explanation
        System.out.println("For the calculation, please enter the number on which action should be performed : ");
        System.out.println("------------------------------------------------------------------------------");
        Scanner firstNumIn = new Scanner(System.in);
        // Assert if user set forbidden parameter (not digit)
        if (!firstNumIn.hasNextDouble()) {
            System.out.println("*****************************************************************************");
            System.out.println("You've entered an incorrect value. The value should be numerical.\n " +
                    "Please restart the program for recalculation");
            return;
        }
        double firstNum = firstNumIn.nextDouble();

        // Action symbol input algorithm with user explanation
        System.out.println("Now, select the desired action (+, -, *, or /): ");
        System.out.println("------------------------------------------------------------------------------");
        Scanner actionIn = new Scanner(System.in);
        String action = actionIn.nextLine();
        // Assert if user set forbidden parameter (not one from four allowable)
        if (!(action.equals("+") || action.equals("-") || action.equals("*") || action.equals("/"))) {
            System.out.println("*****************************************************************************");
            System.out.println("You've entered an incorrect action value.\nValid signs \"+\" addition, " +
                    "\"-\" subtraction, \"*\" multiplication and \"/\" division.\nPlease restart the program for" +
                    "recalculation");
            return;
        }

        // Second number input algorithm with user explanation
        System.out.println("Finally, enter the number to which action shoula be performed : ");
        System.out.println("------------------------------------------------------------------------------");
        Scanner secondNumIn = new Scanner(System.in);
        // Assert if user set forbidden parameter (not digit)
        if (!secondNumIn.hasNextDouble()) {
            System.out.println("*****************************************************************************");
            System.out.print("You've entered an incorrect value. The value should be numerical.\n " +
                    "Please restart the program for recalculation");
            return;
        }
        double secondNum = secondNumIn.nextDouble();

        String result;

        // Calculation algorithm using switch-case operator
        switch (action) {
            case "+": {
                result = String.format("%.3f", (firstNum + secondNum));
                System.out.println("*******************************************************************************");
                System.out.println("The result of calculation " + firstNum + " + " + secondNum + " equals " + result);
                break;
            }
            case "-": {
                result = String.format("%.3f", (firstNum - secondNum));
                System.out.println("*******************************************************************************");
                System.out.println("The result of calculation " + firstNum + " - " + secondNum + " equals" + result);
                break;
            }
            case "*": {
                result = String.format("%.3f", (firstNum * secondNum));
                System.out.println("*******************************************************************************");
                System.out.println("The result of calculation " + firstNum + " * " + secondNum + " equals " + result);
                break;
            }
            case "/": {
                result = String.format("%.3f", (firstNum / secondNum));
                System.out.println("*******************************************************************************");
                System.out.println("The result of calculation " + firstNum + " / " + secondNum + " equals " + result);
                break;
            }
        }
    }
}
