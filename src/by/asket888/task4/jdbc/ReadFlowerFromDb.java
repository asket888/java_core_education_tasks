package by.asket888.java.task4.jdbc;

import by.asket888.java.task4.overallclass.OverallAbsClass;
import org.apache.derby.jdbc.EmbeddedDriver;

import java.sql.*;

/** TASK 4.1:
 *  Add data reading from DB using jdbc driver */

public class ReadFlowerFromDb extends OverallAbsClass {

    // Create variables with information necessary for connection to DB
    private String url = "jdbc:derby:src/by/asket888/java/task4/jdbc/flowers_db";
    private String login = "Andrei_Talashka";
    private String password = "1234";

    // Create variables for setting jdbc Class objects
    private Connection conn;
    private ResultSet resultSet;

    // Override extended from OverallAbsClass method selectFlowerName()
    @Override
    public String selectFlowerName(int flowerId) throws SQLException {

        // try DB driver register, and catch an exception if something is wrong with it
        try {
            DriverManager.registerDriver(new EmbeddedDriver());
        } catch (SQLException e) {
            System.err.println("DB driver is failed. First of all check your driver and retry");
            // printStackTrace() helps to maximize output to console information about the issue
            e.printStackTrace();
        }

        // try connect to created DB, and catch an exception if something is wrong with it
        try {
            conn = DriverManager.getConnection(url, login, password);
        } catch (Exception e) {
            System.err.println("DB connection is failed. First of all check your url, login, password and retry");
            // printStackTrace() helps to maximize output to console information about the issue
            e.printStackTrace();
        }

        try {
            // try execute information from DB, and catch an exception if something is wrong with result
            try {
                resultSet = conn.createStatement().executeQuery(
                        "SELECT FLOWER_NAME FROM flowers WHERE ID =" + flowerId);
            } catch (Exception e) {
                System.err.println("executeQuery is failed. First of all check your SQL query and retry");
                // printStackTrace() helps to maximize output to console information about the issue
                e.printStackTrace();
            }

            int columnCount = resultSet.getMetaData().getColumnCount();

            // Check all DB table rows using resultSet next() method
            while (resultSet.next()) {
                // One by one check all rows
                for (int i = 1; i <= columnCount; i++) {
                    // And set only String result to flowerName variable
                    flowerName = resultSet.getString(i);
                }
            }
        } finally {
            // Close connection to DB after all cycle is over
            if (conn != null) {
                conn.close();
            }
        }
        // return flowerName variable to use result in child flowers classes
        return flowerName;
    }

    // Override extended from OverallAbsClass method selectFlowerPrice()
    @Override
    public double selectFlowerPrice(int flowerId) throws SQLException {

        // try DB driver register, and catch an exception if something is wrong with it
        try {
            DriverManager.registerDriver(new EmbeddedDriver());
        } catch (SQLException e) {
            System.err.println("DB driver is failed. First of all check your driver and retry");
            // printStackTrace() helps to maximize output to console information about the issue
            e.printStackTrace();
        }

        // try connect to created DB, and catch an exception if something is wrong with it
        try {
            conn = DriverManager.getConnection(url, login, password);
        } catch (Exception e) {
            System.err.println("DB connection is failed. First of all check your url, login, password and retry");
            // printStackTrace() helps to maximize output to console information about the issue
            e.printStackTrace();
        }

        try {
            // try execute information from DB, and catch an exception if something is wrong with result
            try {
                resultSet = conn.createStatement().executeQuery(
                        "SELECT FLOWER_PRICE FROM flowers WHERE ID =" + flowerId);
            } catch (Exception e) {
                System.err.println("executeQuery is failed. First of all check your SQL query and retry");
                // printStackTrace() helps to maximize output to console information about the issue
                e.printStackTrace();
            }

            int columnCount = resultSet.getMetaData().getColumnCount();

            // Check all DB table rows using resultSet next() method
            while (resultSet.next()) {
                // One by one check all rows
                for (int i = 1; i <= columnCount; i++) {
                    // And set only String result to flowerName variable
                    flowerPrice = resultSet.getDouble(i);
                }
            }
        } finally {
            // Close connection to DB after all cycle is over
            if (conn != null) {
                conn.close();
            }
        }
        // return flowerName variable to use result in child flowers classes
        return flowerPrice;
    }
}
