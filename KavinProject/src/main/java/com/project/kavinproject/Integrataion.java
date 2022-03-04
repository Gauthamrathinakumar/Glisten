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

    public void getEmployeeFromZingHR(String operations) {
        JSONObject jsono = new JSONObject(
                "{\n"
                + "    \"SubscriptionName\": \"sfpluat\",\n"
                + "    \"Token\": \"d050cfe1270842e694f93d3cd3e3cceb\",\n"
                + "    \"PageSize\": \"400\",\n"
                + "    \"PageNumber\": \"4\",\n"
                + "    \"Fromdate\": \"14-02-2022 11:00:00\",\n"
                + "    \"Todate\": \"28-02-2022 12:00:00\",\n"
                + "    \"EmpFlag\": \"" + operations + "\"\n"
                + "}"
        //                "{\"Token\":\"d050cfe1270842e694f93d3cd3e3cceb\",\"SubscriptionName\":\"sfpluat\", \"PageSize\":\"20\",\"PageNumber\":1}"
        //                "{\n"
        //                + "    \"SubscriptionName\": \"sfpluat\",\n"
        //                + "    \"Token\": \"d050cfe1270842e694f93d3cd3e3cceb\",\n"
        //                + "    \"PageSize\":\"16\",\n"
        //                + "    \"PageNumber\":\"1\",\n"
        //                + "    \"Fromdate\":\"11-01-2022 11:00:00\",\n"
        //                + "    \"Todate\":\"17-01-2022 12:00:00\"\n"
        //                + "}"
        //                "{\n"
        //                + "    \"SubscriptionName\": \"sfpluat\",\n"
        //                + "    \"Token\": \"d050cfe1270842e694f93d3cd3e3cceb\",\n"
        //                + "    \"PageSize\":\"100\",\n"
        //                + "    \"PageNumber\":\"1\",\n"
        //                + "    \"EmpFlag\":\"Edit\"\n"
        //                + "}"
        );
        CallWebservice callWebservice = new CallWebservice();
        DBOperations dBOperations = new DBOperations();
        String responseOutput = callWebservice.callRestServiceWithBasicAuth("POST", "https://clientuat.zinghr.com/2015/route/EmployeeDetails/GetEmployeeMasterDetails", "ZINGHR", "SUGUNA", jsono.toString(), "application/json");
        JSONObject jsonresult = new JSONObject(responseOutput);
        JSONArray jsonArray = jsonresult.getJSONArray("Employees");
        System.out.println(jsonArray.length());

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < jsonArray.length(); i++) {
            Employee employeeObject = new Employee();
            JSONObject employeeJsonObject, attributeJSONObject, bankJsonObject;
            employeeJsonObject = (JSONObject) jsonArray.get(i);
            JSONArray attributeJSONArray = employeeJsonObject.getJSONArray("Attributes");

            for (int atrributeCounter = 0; atrributeCounter < attributeJSONArray.length(); atrributeCounter++) {
                attributeJSONObject = attributeJSONArray.getJSONObject(atrributeCounter);
                switch (attributeJSONObject.getString("AttributeTypeDesc")) {
                    case AttributesEmployeeConstants.company:
                        employeeObject.setCompany(attributeJSONObject.getString("AttributeTypeUnitDesc"));
                        break;
                    case AttributesEmployeeConstants.orgName:
                        employeeObject.setOrganization(attributeJSONObject.getString("AttributeTypeUnitDesc"));
                        break;
                    case AttributesEmployeeConstants.orgLocation:
                        employeeObject.setLocation(attributeJSONObject.getString("AttributeTypeUnitDesc"));
                        break;
                    case AttributesEmployeeConstants.designation:
                        employeeObject.setDesignation(attributeJSONObject.getString("AttributeTypeUnitDesc"));
                        break;
                    case AttributesEmployeeConstants.level:
                        employeeObject.setGrade(attributeJSONObject.getString("AttributeTypeUnitDesc"));
                        break;
                    case AttributesEmployeeConstants.strategicBusinessUnit:
                        employeeObject.setStrategicBusinessUnit(attributeJSONObject.getString("AttributeTypeUnitDesc"));
                        break;
                    case AttributesEmployeeConstants.zone:
                        employeeObject.setZone(attributeJSONObject.getString("AttributeTypeUnitDesc"));
                        break;
                    case AttributesEmployeeConstants.businessUnit:
                        employeeObject.setBusinessUnit(attributeJSONObject.getString("AttributeTypeUnitDesc"));
                        break;
                    case AttributesEmployeeConstants.cluster:
                        employeeObject.setCluster(attributeJSONObject.getString("AttributeTypeUnitDesc"));
                        break;
                    case AttributesEmployeeConstants.division:
                        employeeObject.setDivison(attributeJSONObject.getString("AttributeTypeUnitDesc"));
                        break;
                    case AttributesEmployeeConstants.subDivision:
                        employeeObject.setSubDivision(attributeJSONObject.getString("AttributeTypeUnitDesc"));
                        break;
                    case AttributesEmployeeConstants.department:
                        employeeObject.setDepartment(attributeJSONObject.getString("AttributeTypeUnitDesc"));
                        break;
                    case AttributesEmployeeConstants.functionalGrouping:
                        employeeObject.setFunctionalGrouping(attributeJSONObject.getString("AttributeTypeUnitDesc"));
                        break;
                    case AttributesEmployeeConstants.subDepartment:
                        employeeObject.setSubDepartment(attributeJSONObject.getString("AttributeTypeUnitDesc"));
                        break;
                    case AttributesEmployeeConstants.subLevel:
                        employeeObject.setSubLevel(attributeJSONObject.getString("AttributeTypeUnitDesc"));
                        break;
                    case AttributesEmployeeConstants.positionCode:
                        employeeObject.setPositionCode(attributeJSONObject.getString("AttributeTypeUnitDesc"));
                        break;

                }
            }
            employeeObject.setEmployeeCode(employeeJsonObject.getString("EmployeeCode"));
            employeeObject.setFirstName(employeeJsonObject.getString("FirstName"));
            employeeObject.setLastName(employeeJsonObject.getString("LastName"));
            employeeObject.setSalutation(employeeJsonObject.getString("Salutation"));
            employeeObject.setGender(employeeJsonObject.getString("Gender"));
            employeeObject.setEmploymentType(employeeJsonObject.getString("EmploymentType"));
            employeeObject.setDateofBirth(employeeJsonObject.getString("DateofBirth"));
            employeeObject.setAge(employeeJsonObject.getString("Age"));
            employeeObject.setEmail(employeeJsonObject.getString("Email"));
            employeeObject.setPanNumber(employeeJsonObject.getString("PAN"));
            employeeObject.setPfAccountNumber(employeeJsonObject.getString("PFAccountNumber"));
            employeeObject.setUanNumber(employeeJsonObject.getString("UAN"));
            employeeObject.setDateOfJoining(employeeJsonObject.getString("DateofJoining"));
            employeeObject.setDateOfLeaving(employeeJsonObject.getString("DateOfLeaving"));
            employeeObject.setDateOfConfirmation(employeeJsonObject.getString("DateofConfirmation"));
            employeeObject.setMobileNumber(employeeJsonObject.getString("Mobile"));
            employeeObject.setEmployeeStatus(employeeJsonObject.getString("EmployeeStatus"));
            employeeObject.setEmploymentStatus(employeeJsonObject.getString("EmploymentStatus"));
            employeeObject.setReportingManagerName(employeeJsonObject.getString("ReportingManagerName"));
            employeeObject.setReportingManagerCode(employeeJsonObject.getString("ReportingManagerCode"));
            employeeObject.setMiddleName(employeeJsonObject.getString("MiddleName"));
            employeeObject.setNationality(employeeJsonObject.getString("Nationality"));
            employeeObject.setMartialStatus(employeeJsonObject.getString("MaritalStatus"));
            employeeObject.setOperations(operations);
            employeeObject.setSystemCode(employeeJsonObject.getString("SystemCode"));
            employeeObject.setSection(employeeJsonObject.getString("Sections"));
            if (employeeJsonObject.has("BankDetails")) {
                JSONArray bankJsonArray = employeeJsonObject.getJSONArray("BankDetails");
                bankJsonObject = bankJsonArray.getJSONObject(0);
                employeeObject.setAccountNumber(bankJsonObject.getString("AccountNo"));
                employeeObject.setAccountType(bankJsonObject.getString("AccountType"));
                employeeObject.setAccountHolderName(bankJsonObject.getString("AccountHolderName"));
                employeeObject.setBankName(bankJsonObject.getString("BankName"));
                employeeObject.setBranchName(bankJsonObject.getString("BranchName"));
                employeeObject.setIfscCode(bankJsonObject.getString("IFSCCode"));
                employeeObject.setPaymentMode(bankJsonObject.getString("OperationType"));
            }

            employeeList.add(employeeObject);
        }
        System.out.println(employeeList.get(0).toString());
        dBOperations.insertEmployee(employeeList);
    }
}
