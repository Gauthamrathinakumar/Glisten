/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.kavinproject;

import com.project.kavinproject.utility.DBUtils;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gautham
 */
public class DBOperations {

    public void insertEmployee(List<Employee> employeeList) {
        DBUtils dbUtils = new DBUtils();
        Connection connection = null;
        Statement stmt = null;
        try {
            connection = dbUtils.dbInitialization();
            for (Employee employee : employeeList) {
                String peopleSql = "INSERT ALL into\n"
                        + " xxsug_per_all_people_stg (\n"
                        + "    EMPLOYEE_NUMBER\n"
                        + "    ,LAST_NAME\n"
                        + "    ,FIRST_NAME\n"
                        + "    ,TITLE\n"
                        + "    ,GENDER\n"
                        + "    ,DATE_OF_BIRTH\n"
                        + ") VALUES (\n"
                        + "'" + employee.getEmployeeCode() + "'\n"
                        + ",'" + employee.getLastName() + "'\n"
                        + ",'" + employee.getFirstName() + "'\n"
                        + ",'" + employee.getSalutation() + "'\n"
                        + ",'" + employee.getGender() + "'\n"
                        + ",'" + employee.getDateofBirth() + "'\n"
                        + ")\n"
                        + "into xxstg_per_all_assign_stg(\n"
                        + "ORGANIZATION_NAME\n"
                        + ",LOCATION_NAME\n"
                        + ",JOB_NAME\n"
                        + ") Values (\n"
                        + "'" + employee.getOrgName() + "'\n"
                        + ",'" + employee.getOrgLocation() + "'\n"
                        + ",'" + employee.getDesignation() + "'\n"
                        + ")\n"
                        + "select 1 from dual\n";

                insertTable(connection, stmt, peopleSql);
            }
        } catch (Exception e) {

            e.printStackTrace();
        } finally {
            dbUtils.dbConnectionDestroy(connection, stmt);
        }
    }

    public void insertTable(Connection connection, Statement statement, String sql) {
        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
