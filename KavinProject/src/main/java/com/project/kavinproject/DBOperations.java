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
                        + "     EMPLOYEE_NUMBER\n"
                        + "    ,OLD_EMPLOYEE_NUMBER\n"
                        + "    ,LAST_NAME\n"
                        + "    ,FIRST_NAME\n"
                        + "    ,TITLE\n"
                        + "    ,GENDER\n"
                        + "    ,PERSON_TYPE\n"
                        + "    ,BUSINESS_NAME\n"
                        + "    ,DATE_OF_BIRTH\n"
                        + "     ,EMAIL_ADDRESS\n"
                        + "    ,PER_INFORMATION4\n"
                        + "    ,PER_INFORMATION8\n"
                        + "    ,PER_INFORMATION13\n"
                        + "    ,PER_INFORMATION17\n"
                        + "    ,ORIGINAL_DATE_OF_HIRE\n"
                        + "    ,EFFECTIVE_START_DATE\n"
                        + "    ,EFFECTIVE_END_DATE\n"
                        + "    ,LANDLINENO\n"
                        + ") VALUES (\n"
                        + "'" + employee.getEmployeeCode() + "'\n"
                        + ",'" + employee.getEmployeeCode() + "'\n"
                        + ",'" + employee.getLastName() + "'\n"
                        + ",'" + employee.getFirstName() + "'\n"
                        + ",'" + employee.getSalutation() + "'\n"
                        + ",'" + employee.getGender() + "'\n"
                        + ",'" + employee.getEmployeeStatus() + "'\n"
                        + ",'" + employee.getCompany()+ "'\n"
                        + ",'" + employee.getDateofBirth() + "'\n"
                        + ",'" + employee.getEmail() + "'\n"
                        + ",'" + employee.getPanNumber() + "'\n"
                        + ",'" + employee.getPfAccountNumber() + "'\n"
                        + ",'" + employee.getPfAccountNumber() + "'\n"
                        + ",'" + employee.getUanNumber() + "'\n"
                        + ",'" + employee.getDateOfJoining() + "'\n"
                        + ",'" + employee.getDateOfJoining() + "'\n"
                        + ",'" + employee.getDateOfLeaving() + "'\n"
//                        + ",'" + employee.getDateOfConfirmation() + "'\n"
                        + ",'" + employee.getMobileNumber() + "'\n"
                        + ")\n"
                        + "into xxstg_per_all_assign_stg(\n"
                        + "ORGANIZATION_NAME\n"
                        + ",LOCATION_NAME\n"
                        + ",JOB_NAME\n"
                        + ",POSITION_NAME\n"
                        + ",GRADE_NAME\n"
                        + ",STRBU\n"
                        + ",PZONE\n"
                        + ",BU\n"
                        + ",PCLUSTER\n"
                        + ",DIVISION\n"
                        + ",SUBDIVISION\n"
                        + ",DEPT\n"
                        + ",FUNTGROUP\n"
                        + ",SUBDEPT\n"
                        + ",SUBLEVEL\n"
                        + ",ASSIGNMENT_STATUS\n"
//                        + ""
                        + ") Values (\n"
                        + "'" + employee.getOrganization() + "'\n"
                        + ",'" + employee.getLocation() + "'\n"
                        + ",'" + employee.getDesignation() + "'\n"
                        + ",'" + employee.getPositionCode() + "'\n"
                        + ",'" + employee.getGrade() + "'\n"
                        //                        + ",'" + employee.getPayroll() + "'\n"
                        + ",'" + employee.getStrategicBusinessUnit() + "'\n"
                        + ",'" + employee.getZone() + "'\n"
                        + ",'" + employee.getBusinessUnit() + "'\n"
                        + ",'" + employee.getCluster() + "'\n"
                        + ",'" + employee.getDivison() + "'\n"
                        + ",'" + employee.getSubDivision() + "'\n"
                        + ",'" + employee.getDepartment() + "'\n"
                        + ",'" + employee.getFunctionalGrouping() + "'\n"
                        + ",'" + employee.getSubDepartment() + "'\n"
                        + ",'" + employee.getSubLevel() + "'\n"
                        + ",'" + employee.getEmployeeStatus() + "'\n"
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
