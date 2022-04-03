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
public class EmployeePayment {

    private String company;
    private String paymentType;
    private String employeeCode;
    private String supplierCode;
    private String expenseClaimRefNo;
    private String date;
    private String expenseAmount;
    private String descrption;
    private String expenseType;
    private String expenseAccount;
    private String expenseLineAmount;

    @Override
    public String toString() {
        return "EmployeePayment{" + "company=" + company + ", paymentType=" + paymentType + ", employeeCode=" + employeeCode + ", supplierCode=" + supplierCode + ", expenseClaimRefNo=" + expenseClaimRefNo + ", date=" + date + ", expenseAmount=" + expenseAmount + ", descrption=" + descrption + ", expenseType=" + expenseType + ", expenseAccount=" + expenseAccount + ", expenseLineAmount=" + expenseLineAmount + '}';
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getExpenseClaimRefNo() {
        return expenseClaimRefNo;
    }

    public void setExpenseClaimRefNo(String expenseClaimRefNo) {
        this.expenseClaimRefNo = expenseClaimRefNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(String expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public String getExpenseAccount() {
        return expenseAccount;
    }

    public void setExpenseAccount(String expenseAccount) {
        this.expenseAccount = expenseAccount;
    }

    public String getExpenseLineAmount() {
        return expenseLineAmount;
    }

    public void setExpenseLineAmount(String expenseLineAmount) {
        this.expenseLineAmount = expenseLineAmount;
    }

}
