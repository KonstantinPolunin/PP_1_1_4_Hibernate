package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {


    private static final String URL = "jdbc:mysql://localhost:3306/firstdb";
    private static final String userName = "root";
    private static final String password = "AAaa1#85";


    public static Connection getConnection() {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, userName, password);
            System.out.println("Connection is OK");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
