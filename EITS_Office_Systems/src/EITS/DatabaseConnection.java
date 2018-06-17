package EITS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *@author Jakob 2104990817, Brayden 2101560216,  Alex 7105395517
 *@purpose This is a class that allows for the database to connected to the application.
 *@version control 1.0
 *@date 10/06/2018
 */
import java.sql.*;
import com.mysql.jdbc.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class DatabaseConnection {
    // Connect to the database
    public static com.mysql.jdbc.Connection getConnection(){
        Connection con;
        try{
         con = (com.mysql.jdbc.Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/eits_office_systems","root","");
         return con;
        } catch( Exception ex) {
          ex.printStackTrace();
          return null;
        } // end of catch
    } // end of getConnection
}
