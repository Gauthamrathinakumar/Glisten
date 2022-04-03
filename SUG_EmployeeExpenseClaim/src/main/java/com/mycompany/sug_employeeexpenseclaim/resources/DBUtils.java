/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sug_employeeexpenseclaim.resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kavin-
 */
public class DBUtils {

    Connection connection;

    public Connection dbInitialization() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            connection = DriverManager.getConnection("jdbc:oracle:thin:@10.4.1.49:1530:TEST", "apps", "sugapps");

            return connection;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public String dbConnectionDestroy(Connection connection, Statement stmt, ResultSet rSet) {

        try {
            if (rSet != null) {
                rSet.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (connection != null) {
                connection.close();
            }
            return "Connection closed successfully";
        } catch (SQLException ex) {
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, ex);
            return "Error in closing Connection";
        }

    }

    public String dbConnectionDestroy(Connection connection, Statement stmt) {

        try {

            if (stmt != null) {
                stmt.close();
            }
            if (connection != null) {
                connection.close();
            }
            return "Connection closed successfully";
        } catch (SQLException ex) {
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, ex);
            return "Error in closing Connection";
        }

    }

}
