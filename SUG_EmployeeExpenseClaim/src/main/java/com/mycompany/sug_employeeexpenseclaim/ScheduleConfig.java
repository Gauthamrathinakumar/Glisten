/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sug_employeeexpenseclaim;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 *
 * @author lenovo
 */
public class ScheduleConfig {

    public void schedulerService(Boolean status) {
        try {
            JobDetail empExpenseJob = JobBuilder.newJob(EmployeeExpenseScheduleService.class)
                    .withIdentity("EmployeeExpenseJob", "SugJobGroup").build();
//            .withIdentity("Test", "Sample").build();
            Trigger trigger = TriggerBuilder
                    .newTrigger()
                    .withIdentity("EmployeeExpenseTrigger", "SugTriggerGroup")
                    //                    .withIdentity("trigger1", "trig1")
                    .withSchedule(
                            SimpleScheduleBuilder.simpleSchedule()
                                    //                                    .withIntervalInSeconds(10).repeatForever())
                                    .withIntervalInMinutes(60).repeatForever())
                    .build();
            // schedule it
            Scheduler scheduler = new StdSchedulerFactory().getScheduler();
            if (!status) {
                System.out.println("Shutdown executed");
                scheduler.interrupt("EmployeeExpenseJob");
                scheduler.shutdown();
            } else {
                scheduler.start();
                scheduler.scheduleJob(empExpenseJob, trigger);
                System.out.println("" + scheduler.getJobGroupNames());
                System.out.println("" + scheduler.getTriggerGroupNames());
            }
        } catch (Exception ex) {
            System.out.println("Exception in Scheduling :" + ex);
        }

    }
}
