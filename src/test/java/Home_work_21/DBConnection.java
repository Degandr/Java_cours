package Home_work_21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

    public static Connection connect;
    public static Statement statement;

    public static void connect() {
        try {
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/test?"
                            + "user=root&password=admin");
            statement = connect.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeConnection() {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if (connect != null) {
            try {
                connect.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        connect();
        closeConnection();
    }
}
