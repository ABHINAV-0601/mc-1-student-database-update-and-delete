package com.jap;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class DeleteUpdateStudentData
{

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection=null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "admin";
        connection = DriverManager.getConnection(url,user,password);
        return connection;

    }

    public void deleteStudentData() throws SQLException, ClassNotFoundException {
      // call getConnection() method
       Connection connection = getConnection();
       Statement statement = connection.createStatement();
        //execute delete query
    }

    public void updateStudentData(){
        // call getConnection() method

        //execute update query
    }

    public static void main(String[] args) {
        DeleteUpdateStudentData salesDataDemo = new DeleteUpdateStudentData();
        try {
            salesDataDemo.deleteStudentData();
            salesDataDemo.updateStudentData();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
