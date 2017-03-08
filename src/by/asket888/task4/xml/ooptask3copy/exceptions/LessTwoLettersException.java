package by.asket888.java.task4.xml.ooptask3copy.exceptions;

public class LessTwoLettersException extends Exception {

    public LessTwoLettersException (int num) {
        System.err.println("Some flower's names in generated bouquet consist of " + num + " symbol");
    }
}
