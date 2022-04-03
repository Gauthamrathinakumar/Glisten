/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sug_employeeexpenseclaim;

/**
 *
 * @author Kavin-
 */
public class Run {

    public static void main(String[] args) {
        Integration integration = new Integration();
//        integration.getEmployeePaymentFromZingHR("");
        DBOperations db = new DBOperations();
        db.getScheduleRec();
    }
}
