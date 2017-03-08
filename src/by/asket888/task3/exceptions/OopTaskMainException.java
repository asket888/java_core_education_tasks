package by.asket888.java.task3.exceptions;

/** TASK 3.1:
 *  Create user-defined exception classes and organize a treatment of possible exceptions */

public class OopTaskMainException extends Exception {

    /* Here the list of all built-in exceptions1 added to the project;

    1) Use NullPointerException() in Class Flower if set parameter has value == null
       (try/catch in Main class);
    2) Use IllegalArgumentException() in Class Flower set parameter has value < 0;
       (try/catch in Main class);
    3) Use ArrayStoreException() in Class FlowerCollection if any of added elements have not Flower type;
       (try/catch in BouquetGenerator class);
    4) Use IllegalArgumentException() in Class BouquetGenerator if formula of random quantity of flowers in bouquet
       < 3 or > 7 (no try/catch in this exception);
    5) Use IndexOutOfBoundsException() in Class BouquetGenerator if loop contains wrong comparison sign
       (no try/catch in this exception);
    */

    /* Here the list of all user-defined exceptions1 added to the project. During this task I've tried to use different
       ways of exception message output;

    6) HeadOopTaskException was added like main user exception. One used to show that all exceptions were foreseen by
       developers (developers seal). It was thrown after each exception catching;
    7) LessTwoLettersException was added for checking if any names in childflowers objects consists of less then 2
       symbols (try/catch in Main class);
    8) LessTwoLettersException was added for checking if any names in childflowers objects consists of more then 2
       words (try/catch in Main class);
      */

    public OopTaskMainException() {
        System.err.println("This massage shows that problem matches to OopTaskMainException impact. \n" +
                "Whatever that mean...");
    }
}
