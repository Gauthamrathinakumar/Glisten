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
                        + "    ,EMAIL_ADDRESS\n"
                        + "    ,PER_INFORMATION4\n"
                        + "    ,PER_INFORMATION8\n"
                        + "    ,PER_INFORMATION13\n"
                        + "    ,PER_INFORMATION17\n"
                        + "    ,ORIGINAL_DATE_OF_HIRE\n"
                        + "    ,EFFECTIVE_START_DATE\n"
                        + "    ,EFFECTIVE_END_DATE\n"
                        + "    ,LANDLINENO\n"
                        + "    ,MARITAL_STATUS\n"
                        + "    ,MIDDLE_NAMES\n"
                        + "    ,NATIONALITY\n"
                        + "    ,ACTION_CODE\n"
                        + "    ,ACTION\n"
                        + "    ,SYS_EMP_CODE"
                        + ") VALUES (\n"
                        + "'" + employee.getEmployeeCode() + "'\n"
                        + ",'" + employee.getEmployeeCode() + "'\n"
                        + ",'" + employee.getLastName() + "'\n"
                        + ",'" + employee.getFirstName() + "'\n"
                        + ",'" + employee.getSalutation() + "'\n"
                        + ",'" + employee.getGender() + "'\n"
                        + ",'" + employee.getEmployeeStatus() + "'\n"
                        + ",'" + employee.getCompany() + "'\n"
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
                        + ",'" + employee.getMartialStatus() + "'\n"
                        + ",'" + employee.getMiddleName() + "'\n"
                        + ",'" + employee.getNationality() + "'\n"
                        + ",'" + employee.getOperations() + "'\n"
                        + ",'" + employee.getSection() + "'\n"
                        + ",'" + employee.getSystemCode() + "'\n"
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
                        + ",EFFECTIVE_START_DATE\n"
                        + ",EFFECTIVE_END_DATE\n"
                        + ",EMPLOYEE_NUMBER\n"
                        + ",ASSIGNMENT_NUMBER\n"
                        + ",SUPERVISOR_CODE\n"
                        + ",ACCTNO\n"
                        + ",ACCTTYPE\n"
                        + ",BANKNAME\n"
                        + ",BRANCH\n"
                        + ",IFSC\n"
                        + ",ACCT_HOLDER_NAME\n"
                        + ",ACTION_CODE\n"
                        + ",BUSINESS_GROUP_NAME\n"
                        + ",SYS_SUPEMP_CODE\n"
                        + ",ACTION"
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
                        + ",'" + employee.getDateOfJoining() + "'\n"
                        + ",'" + employee.getDateOfLeaving() + "'\n"
                        + ",'" + employee.getEmployeeCode() + "'\n"
                        + ",'" + employee.getEmployeeCode() + "'\n"
                        + ",'" + employee.getReportingManagerCode() + "'\n"
                        + ",'" + employee.getAccountNumber() + "'\n"
                        + ",'" + employee.getAccountType() + "'\n"
                        + ",'" + employee.getBankName() + "'\n"
                        + ",'" + employee.getBranchName() + "'\n"
                        + ",'" + employee.getIfscCode() + "'\n"
                        + ",'" + employee.getAccountHolderName() + "'\n"
                        + ",'" + employee.getOperations() + "'\n"
                        + ",'" + employee.getCompany() + "'\n"
                        + ",'" + employee.getSystemCode() + "'\n"
                        + ",'" + employee.getSection() + "'\n"
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
