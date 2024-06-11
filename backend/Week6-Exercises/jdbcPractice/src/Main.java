import java.sql.*;

public class Main {
    public static final String DB_URL = "jdbc:mysql://localhost/company";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void databaseConnection() {
        Connection connection = null;
        String prSQL = "INSERT INTO employees (name,position,salary) VALUES (?,?,?)";
        try{
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(prSQL);
            preparedStatement.setString(1,"ali");
            preparedStatement.setString(2,"aşçı");
            preparedStatement.setInt(3,1000);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1,"veli");
            preparedStatement.setString(2,"şarkıcı");
            preparedStatement.setInt(3,1005);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1,"java");
            preparedStatement.setString(2,"king");
            preparedStatement.setInt(3,99000);
            preparedStatement.executeUpdate();

            preparedStatement.close();

        }catch (SQLException e ){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        databaseConnection();
        }
}