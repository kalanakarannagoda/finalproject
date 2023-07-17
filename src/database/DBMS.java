package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBMS {

    public static Connection connection;

    static {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/final project", "root", "thiwanka");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void iud(String query) throws Exception {
        Statement s = connection.createStatement();
        s.executeUpdate(query);
    }

    public static ResultSet search(String query) throws Exception {
        Statement s = connection.createStatement();
        ResultSet rs = s.executeQuery(query);
        return rs;
    }

}
