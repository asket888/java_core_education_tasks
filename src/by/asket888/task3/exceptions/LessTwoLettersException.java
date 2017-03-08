package by.asket888.java.task3.exceptions;

/** TASK 3.1:
 *  Create user-defined exception classes and organize a treatment of possible exceptions */

public class LessTwoLettersException extends Exception {

     /* This exception will be thrown if chosen by BouquetGenerator() method flower will have less than
      * two letters in name. Feature of this exception is that one shows exact number of symbols in message*/

    public LessTwoLettersException (int num) {
        System.err.println("Some flower's names in generated bouquet consist of " + num + " symbol");
    }
}
