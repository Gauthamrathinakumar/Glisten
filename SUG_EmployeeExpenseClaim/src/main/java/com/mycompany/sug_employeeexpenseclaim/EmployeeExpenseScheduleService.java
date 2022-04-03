/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sug_employeeexpenseclaim;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 *
 * @author Kavin-
 */
public class EmployeeExpenseScheduleService implements Job {

    @Override
    public void execute(JobExecutionContext jec) throws JobExecutionException {

        Integration integration = new Integration();
        integration.getEmployeePaymentFromZingHR("");
    }

}
