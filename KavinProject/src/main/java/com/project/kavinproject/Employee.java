/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.kavinproject;

/**
 *
 * @author Gautham
 */
public class Employee {

    private String employeeCode;
    private String firstName;
    private String lastName;
    private String salutation;
    private String middleName;
    private String gender;
    private String dateofBirth;
    private String maritalStatus;
    private String nationality;
    private String personalEmailAddress;
    private String company;
    private String orgName;
    private String orgLocation;
    private String level;
    private String designation;

    @Override
    public String toString() {
        return "Employee{" + "employeeCode=" + employeeCode + ", firstName=" + firstName + ", lastName=" + lastName + ", salutation=" + salutation + ", middleName=" + middleName + ", gender=" + gender + ", dateofBirth=" + dateofBirth + ", maritalStatus=" + maritalStatus + ", nationality=" + nationality + ", personalEmailAddress=" + personalEmailAddress + ", company=" + company + ", orgName=" + orgName + ", orgLocation=" + orgLocation + ", level=" + level + ", designation=" + designation + '}';
    }

    public Employee(String employeeCode, String firstName, String lastName, String salutation, String middleName, String gender, String dateofBirth, String maritalStatus, String nationality, String personalEmailAddress, String company, String orgName, String orgLocation, String level, String designation) {
        this.employeeCode = employeeCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salutation = salutation;
        this.middleName = middleName;
        this.gender = gender;
        this.dateofBirth = dateofBirth;
        this.maritalStatus = maritalStatus;
        this.nationality = nationality;
        this.personalEmailAddress = personalEmailAddress;
        this.company = company;
        this.orgName = orgName;
        this.orgLocation = orgLocation;
        this.level = level;
        this.designation = designation;
    }

    public Employee() {
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPersonalEmailAddress() {
        return personalEmailAddress;
    }

    public void setPersonalEmailAddress(String personalEmailAddress) {
        this.personalEmailAddress = personalEmailAddress;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgLocation() {
        return orgLocation;
    }

    public void setOrgLocation(String orgLocation) {
        this.orgLocation = orgLocation;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

}
