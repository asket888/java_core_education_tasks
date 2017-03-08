package by.asket888.java.task3.exceptions;

/** TASK 3.1:
 *  Create user-defined exception classes and organize a treatment of possible exceptions */

public class MoreOneWordException extends Exception {

    /* This exception will be thrown if chosen by BouquetGenerator() method flower will have name consisted of
     * more than one word. Feature of this exception is that one prints information which was added in throw method */

    public MoreOneWordException(String text) {
        System.err.println(text);
    }
}
