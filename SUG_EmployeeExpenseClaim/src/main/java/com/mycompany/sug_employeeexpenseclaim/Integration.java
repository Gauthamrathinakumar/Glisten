/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sug_employeeexpenseclaim;

import com.mycompany.sug_employeeexpenseclaim.resources.CallWebservice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author lenovo
 */
public class Integration {

    public void getEmployeePaymentFromZingHR(String operations) {
        Map<String, String> schedMap = new HashMap<String, String>();
        CallWebservice callWebservice = new CallWebservice();
        DBOperations dBOperations = new DBOperations();
        dBOperations.getScheduleRec();
        JSONObject jsono = new JSONObject(
                "{\n"
                + "	\"SubscriptionName\": \"" + schedMap.get("TOKEN") + "\",\n"
                + "	\"Token\": \"" + schedMap.get("BUSINESS_UNIT") + "\",\n"
                + "	\"ModuleCode\":\"" + schedMap.get("MODULE_CODE") + "\",\n"
                + "	\"FromDate\":\"" + schedMap.get("FROM_DATE") + "\",\n"
                + "	\"ToDate\":\"" + schedMap.get("TO_DATE") + "\"\n"
                + "}"
        );
        String responseOutput = callWebservice.callRestServiceWithBasicAuth("POST", "https://clientuat.zinghr.com/2015/route/JV/GetData", "ZINGHR", "SUGUNA", jsono.toString(), "application/json");
        JSONObject jsonresult = new JSONObject(responseOutput);
        JSONArray jsonArray = jsonresult.getJSONArray("Response");  //need to work on this line
        System.out.println(jsonArray.getJSONArray(0).length());
        JSONArray jsonArrayResp = jsonArray.getJSONArray(0);  //need to work on this line

        List<EmployeePayment> employeePaymentList = new ArrayList<>();
//
        for (int i = 0; i < jsonArrayResp.length(); i++) {
            EmployeePayment employeePaymentObject = new EmployeePayment();
            JSONObject employeeJsonObject;
            employeeJsonObject = (JSONObject) jsonArrayResp.get(i);
            employeePaymentObject.setCompany(employeeJsonObject.getString("Company"));
            employeePaymentObject.setPaymentType(employeeJsonObject.getString("Reim. Category"));
            employeePaymentObject.setEmployeeCode(employeeJsonObject.getString("OLD System Code"));
            employeePaymentObject.setSupplierCode(employeeJsonObject.getString("AP Code"));
            employeePaymentObject.setExpenseClaimRefNo(employeeJsonObject.getString("Exp/ Claim No"));
            employeePaymentObject.setDate(employeeJsonObject.getString("Applied Date"));
            employeePaymentObject.setExpenseAmount(employeeJsonObject.getString("Total Approved Amount"));
            employeePaymentObject.setDescrption(employeeJsonObject.getString("Remarks"));
            employeePaymentObject.setExpenseType(employeeJsonObject.getString("Claim type"));
            employeePaymentObject.setExpenseAccount(employeeJsonObject.getString("GL Account No"));
            employeePaymentObject.setExpenseLineAmount(employeeJsonObject.getString("Exp Component Amount"));
            employeePaymentList.add(employeePaymentObject);
        }
        System.out.println(employeePaymentList.get(0).toString());
        dBOperations.insertEmployeePayment(employeePaymentList);

    }

}
