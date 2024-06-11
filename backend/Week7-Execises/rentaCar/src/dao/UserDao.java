package dao;

import core.Db;
import entity.User;

import java.sql.*;
import java.util.ArrayList;

public class UserDao {
    private final Connection connection;

    public UserDao() {
        this.connection = Db.getInstance();
    }

    public ArrayList<User> findAll(){
        ArrayList<User> userArrayList = new ArrayList<>();
        String query = "SELECT * FROM public.user";

        try{
            Statement st = this.connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                userArrayList.add(this.match(rs));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return userArrayList;
    }

    public User findByLogin(String username, String password){
        User obj = null;
        String query = "SELECT * FROM public.user WHERE user_name = ? AND user_password = ?";

        try{
            PreparedStatement preparedStatement = this.connection.prepareStatement(query);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()){
                obj = this.match(rs);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return obj;
    }

    public User match(ResultSet rs) throws SQLException{
        User obj = new User();
        obj.setId(rs.getInt("user_id"));
        obj.setUsername(rs.getString("user_name"));
        obj.setPassword(rs.getString("user_password"));
        obj.setRole(rs.getString("user_role"));
        return obj;
    }
}
