package EITS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brayden
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
