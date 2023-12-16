package Home_work_21;

import lombok.SneakyThrows;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBDataManipulation extends DBConnection {

    public static ResultSet getAllDataFromTable() throws SQLException {
        String query = "SELECT * FROM names;";
        return statement.executeQuery(query);
    }

    @SneakyThrows
    public static void addTwoNewNameToTable() {
        for (int i = 0; i < 2; i++) {
            PreparedStatement preparedStatement = connect
                    .prepareStatement("INSERT INTO test.names (Name) VALUES (?)");
            preparedStatement.setString(1, DataGenerator.generateFirstName());
            preparedStatement.executeUpdate();
        }
    }
    @SneakyThrows
    public static void removeLastAddedRecord() {
        String getLastIdQuery = "SELECT id FROM test.names ORDER BY id DESC LIMIT 1";
        ResultSet resultSet  = statement.executeQuery(getLastIdQuery);
        if (resultSet.next()) {
            int lastId = resultSet.getInt(1);
            PreparedStatement preparedStatement = connect
                    .prepareStatement("delete from test.names where id = ?");
            preparedStatement.setInt(1, lastId);
            preparedStatement.executeUpdate();
        }
    }

    @SneakyThrows
    public static void main(String[] args) {
        connect();
        addTwoNewNameToTable();
        removeLastAddedRecord();
        ResultSet results = getAllDataFromTable();
        ArrayList<TestTableModel> testTable = new ArrayList<>();
        while (results.next()) {
            TestTableModel testModel = TestTableModel.builder()
                    .id(results.getInt(1))
                    .Name(results.getString("Name"))
                    .build();
            testTable.add(testModel);
        }
        for (TestTableModel testModel: testTable){
            System.out.println(testModel.toString());
        }
        closeConnection();
    }
}
