/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sug_employeeexpenseclaim;

import com.mycompany.sug_employeeexpenseclaim.resources.DBUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kavin-
 */
public class DBOperations {

    public Map<String, String> getScheduleRec() {
        DBUtils dbUtils = new DBUtils();
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        Map<String, String> hm = new HashMap<String, String>();
        try {
            String sql = "SELECT\n"
                    + "    interface_name,\n"
                    + "    subscription_name,\n"
                    + "    token,\n"
                    + "    business_unit,\n"
                    + "    to_char(last_run_time, 'DD-Mon-RR') from_date,\n"
                    + "    module_code,\n"
                    + "    to_char(sysdate, 'DD-Mon-RR') to_date\n"
                    + "FROM\n"
                    + "    xxsug_int_schedule_stg\n"
                    + "WHERE\n"
                    + "    interface_name = 'EMP_EXPENSE'";
            connection = dbUtils.dbInitialization();
            stmt = connection.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println("Interface Name : " + rs.getString("INTERFACE_NAME"));
                System.out.println("Token : " + rs.getString("SUBSCRIPTION_NAME"));
                System.out.println("Business Unit : " + rs.getString("TOKEN"));
                System.out.println("LastRun Time : " + rs.getString("BUSINESS_UNIT"));
                System.out.println("Module Code : " + rs.getString("FROM_DATE"));
                System.out.println("Module Code : " + rs.getString("MODULE_CODE"));
                System.out.println("Module Code : " + rs.getString("TO_DATE"));
                hm.put("INTERFACE_NAME", rs.getString("INTERFACE_NAME"));
                hm.put("SUBSCRIPTION_NAME", rs.getString("SUBSCRIPTION_NAME"));
                hm.put("TOKEN", rs.getString("TOKEN"));
                hm.put("BUSINESS_UNIT", rs.getString("BUSINESS_UNIT"));
                hm.put("FROM_DATE", rs.getString("FROM_DATE"));
                hm.put("MODULE_CODE", rs.getString("MODULE_CODE"));
                hm.put("TO_DATE", rs.getString("TO_DATE"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbUtils.dbConnectionDestroy(connection, stmt, rs);
        }
        return hm;
    }

    public void insertEmployeePayment(List<EmployeePayment> employeePaymentList) {
        DBUtils dbUtils = new DBUtils();
        Connection connection = null;
        Statement stmt = null;
        try {
            connection = dbUtils.dbInitialization();
            for (EmployeePayment employeePayment : employeePaymentList) {
                String peopleSql = "INSERT into\n"
                        + " XXSUG_INV_EXPENSE_STG (\n"
                        + "     COMPANY\n"
                        + "    ,PAYMENT_TYPE\n"
                        + "    ,EMP_CODE\n"
                        + "    ,SUP_CODE\n"
                        + "    ,EXPENSE_REF_NO\n"
                        + "    ,APPLIED_DATE\n"
                        + "    ,EXPENSE_AMT\n"
                        + "    ,DESCRIPTION\n"
                        + "    ,EXPENSE_TYPE\n"
                        + "    ,EXPENSE_ACCOUNT\n"
                        + "    ,EXPENSE_LINE_ACCOUNT\n"
                        + ") VALUES (\n"
                        + "'" + employeePayment.getCompany() + "'\n"
                        + ",'" + employeePayment.getPaymentType() + "'\n"
                        + ",'" + employeePayment.getEmployeeCode() + "'\n"
                        + ",'" + employeePayment.getSupplierCode() + "'\n"
                        + ",'" + employeePayment.getExpenseClaimRefNo() + "'\n"
                        + ",'" + employeePayment.getDate() + "'\n"
                        + ",'" + employeePayment.getExpenseAmount() + "'\n"
                        + ",'" + employeePayment.getDescrption() + "'\n"
                        + ",'" + employeePayment.getExpenseType() + "'\n"
                        + ",'" + employeePayment.getExpenseAccount() + "'\n"
                        + ",'" + employeePayment.getExpenseLineAmount() + "'\n"
                        + ")\n";
//                        + "select 1 from dual\n";

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
