package by.asket888.java.task4.jdbc;

import org.apache.derby.jdbc.EmbeddedDriver;

import java.sql.*;

public class FlowerDbCreation {

    public static void main(String[] args) throws SQLException {

        // Register DB driver
        DriverManager.registerDriver(new EmbeddedDriver());
        // Connect to DB with specific parameters
        Connection connection = DriverManager.getConnection("jdbc:derby:src/by/asket888/java/task4/jdbc/flowers_db;" +
                "create=true;user=Andrei_Talashka;password=1234");
        // Create new Statement for working with DB
        Statement statement = connection.createStatement();
        // Using created statement create new table with 3 columns (ID, FLOWER_NAME and FLOWER_PRICE) in it
        statement.executeUpdate("CREATE TABLE flowers ( ID int GENERATED ALWAYS AS IDENTITY "
                + "(START WITH 1, INCREMENT BY 1) , FLOWER_NAME varchar (255) NOT NULL, FLOWER_PRICE float NOT NULL)");
        // Fill created table fields with flowers and its prices
        statement.addBatch("INSERT INTO flowers (FLOWER_NAME, FLOWER_PRICE) VALUES ('Azalea_db', 12.5)");
        statement.addBatch("INSERT INTO flowers (FLOWER_NAME, FLOWER_PRICE) VALUES ('Bergamot_db', 9.5)");
        statement.addBatch("INSERT INTO flowers (FLOWER_NAME, FLOWER_PRICE) VALUES ('Chrysantemum_db', 4.0)");
        statement.addBatch("INSERT INTO flowers (FLOWER_NAME, FLOWER_PRICE) VALUES ('Daisy_db', 7.0)");
        statement.addBatch("INSERT INTO flowers (FLOWER_NAME, FLOWER_PRICE) VALUES ('Jasmine_db', 8.5)");
        statement.addBatch("INSERT INTO flowers (FLOWER_NAME, FLOWER_PRICE) VALUES ('Marigold_db', 15.5)");
        statement.addBatch("INSERT INTO flowers (FLOWER_NAME, FLOWER_PRICE) VALUES ('Snapdragon_db', 8.0)");
        statement.addBatch("INSERT INTO flowers (FLOWER_NAME, FLOWER_PRICE) VALUES ('Zinnia_db', 6.5)");

        statement.executeBatch();

        // Create new ResultSet and query fields from created table
        ResultSet resultSet = statement.executeQuery("SELECT * FROM flowers");
        // Create new ResultSetMetaData and get meta data from selected table fields
        ResultSetMetaData metaData = resultSet.getMetaData();

        // Use created ResultSetMetaData to pick information for presenting table structure and content in console
        while (resultSet.next()) {
            System.out.println("======================");
            for (int i = 1, columnCount = metaData.getColumnCount(); i <= columnCount; i++) {
                System.out.println(String.format("'%s' : '%s'", metaData.getColumnName(i), resultSet.getString(i)));
            }
        }
    }
}
