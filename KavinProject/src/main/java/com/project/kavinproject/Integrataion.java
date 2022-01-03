/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.kavinproject;

import com.project.kavinproject.utility.CallWebservice;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Gautham
 */
public class Integrataion {

    public void getEmployeeFromZingHR() {
        JSONObject jsono = new JSONObject("{\"Token\":\"d050cfe1270842e694f93d3cd3e3cceb\",\"SubscriptionName\":\"sfpluat\", \"PageSize\":\"10\",\"PageNumber\":1}");
        CallWebservice callWebservice = new CallWebservice();
        DBOperations dBOperations = new DBOperations();
        AttributesEmployee attributesEmployee = new AttributesEmployee();
        String responseOutput = callWebservice.callRestServiceWithBasicAuth("POST", "https://clientuat.zinghr.com/2015/route/EmployeeDetails/GetEmployeeMasterDetails", "ZINGHR", "SUGUNA", jsono.toString(), "application/json");
        JSONObject jsonresult = new JSONObject(responseOutput);
        JSONArray jsonArray = jsonresult.getJSONArray("Employees");
        System.out.println(jsonArray.length());
        JSONObject employeeJsonObject, attributeJSONObject;
        JSONArray attributeJSONArray;
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            employeeJsonObject = (JSONObject) jsonArray.get(i);
            attributeJSONArray = employeeJsonObject.getJSONArray("Attributes");
            for (int atrributeCounter = 0; atrributeCounter < attributeJSONArray.length(); atrributeCounter++) {
                attributeJSONObject = attributeJSONArray.getJSONObject(atrributeCounter);
                switch (attributeJSONObject.getString("AttributeTypeDesc")) {
                    case AttributesEmployeeConstants.company:
                        attributesEmployee.setCompany(attributeJSONObject.getString("AttributeTypeUnitDesc"));
                        break;
                    case AttributesEmployeeConstants.designation:
                        attributesEmployee.setDesignation(attributeJSONObject.getString("AttributeTypeUnitDesc"));
                        break;
                    case AttributesEmployeeConstants.level:
                        attributesEmployee.setLevel(attributeJSONObject.getString("AttributeTypeUnitDesc"));
                        break;
                    case AttributesEmployeeConstants.orgLocation:
                        attributesEmployee.setOrgLocation(attributeJSONObject.getString("AttributeTypeUnitDesc"));
                        break;
                    case AttributesEmployeeConstants.orgName:
                        attributesEmployee.setOrgName(attributeJSONObject.getString("AttributeTypeUnitDesc"));
                        break;
                }
            }
//            System.out.println(i + ". Company : " + attributesEmployee.getCompany());
//            System.out.println(i + ". Org name : " + attributesEmployee.getOrgName());
//            System.out.println(i + ". Org locationm : " + attributesEmployee.getOrgLocation());
//            System.out.println(i + ". designation : " + attributesEmployee.getDesignation());

            employeeList.add(new Employee(
                    employeeJsonObject.getString("EmployeeCode"),
                    employeeJsonObject.getString("FirstName"),
                    employeeJsonObject.getString("LastName"),
                    employeeJsonObject.getString("Salutation"),
                    employeeJsonObject.getString("MiddleName"),
                    employeeJsonObject.getString("Gender"),
                    employeeJsonObject.getString("DateofBirth"),
                    employeeJsonObject.getString("MaritalStatus"),
                    employeeJsonObject.getString("Nationality"),
                    employeeJsonObject.getString("Email"),
                    attributesEmployee.getCompany(),
                    attributesEmployee.getOrgName(),
                    attributesEmployee.getOrgLocation(),
                    attributesEmployee.getLevel(),
                    attributesEmployee.getDesignation()
            )
            );
        }
        System.out.println(employeeList.get(0).toString());
        dBOperations.insertEmployee(employeeList);
    }
}
