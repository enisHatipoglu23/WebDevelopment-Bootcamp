package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

    private static Db instance = null;
    private Connection connection = null;
    private final String DB_URL = "jdbc:postgresql://localhost:5432/rentacar";
    private  final  String DB_USER = "postgres";
    private final String DB_PASSWORD = "postgres";

    private Db(){
        try{
            this.connection = DriverManager.getConnection(
                    DB_URL,
                    DB_USER,
                    DB_PASSWORD
            );
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public Connection getConnection() {
        return connection;
    }

    public static Connection getInstance(){
        try{
            if(instance == null || instance.getConnection().isClosed()){
                instance = new Db();
                return instance.getConnection();
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return instance.getConnection();

        }
}
