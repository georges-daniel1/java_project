/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sfinalraan.georges;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Admin
 */
public class ConnectDB {

    final String DB_HOST = "jdbc:mysql://localhost/java_project";
    final String DB_USER = "root";
    final String DB_PWD = "root";
    Statement conn;
    
    public ConnectDB() {
        Connection con;
        try {
            con = DriverManager.getConnection(DB_HOST, DB_USER, DB_PWD);
            conn = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null ,ex);
        }
    }
    public Statement getStatement() {
        return this.conn;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
