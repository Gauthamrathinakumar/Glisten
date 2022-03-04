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
    private String gender;
    private String employmentType;
//    private String identification;
    private String company;
    private String dateofBirth;
    private String age;
    private String email;
    private String panNumber;
//    private String residentialStatus;
    private String pfAccountNumber;
    private String uanNumber;
    private String dateOfJoining;
    private String dateOfLeaving;
    private String dateOfConfirmation;
    private String mobileNumber;
    private String organization;
    private String location;
    private String designation;
    private String positionCode;
    private String grade;
//    private String payroll;
    private String strategicBusinessUnit;
    private String zone;
    private String businessUnit;
    private String cluster;
    private String divison;
    private String subDivision;
    private String department;
    private String functionalGrouping;
    private String subDepartment;
    private String subLevel;
    private String employeeStatus;
//    private String assignmentNumber;

    // Newly Added columns
    private String employmentStatus;
    private String accountNumber;
    private String accountType;
    private String bankName;
    private String branchName;
    private String ifscCode;
    private String accountHolderName;
    private String paymentMode;
    private String reportingManagerName;
    private String reportingManagerCode;
    private String middleName;
    private String nationality;
    private String operations;
    private String martialStatus;
    private String systemCode;
    private String section;

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(String martialStatus) {
        this.martialStatus = martialStatus;
    }
    
    public String getOperations() {
        return operations;
    }

    public void setOperations(String operations) {
        this.operations = operations;
    }
    
    
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

   

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getReportingManagerName() {
        return reportingManagerName;
    }

    public void setReportingManagerName(String reportingManagerName) {
        this.reportingManagerName = reportingManagerName;
    }

    public String getReportingManagerCode() {
        return reportingManagerCode;
    }

    public void setReportingManagerCode(String reportingManagerCode) {
        this.reportingManagerCode = reportingManagerCode;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

//    public String getIdentification() {
//        return identification;
//    }
//    public void setIdentification(String identification) {
//        this.identification = identification;
//    }
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

//    public String getResidentialStatus() {
//        return residentialStatus;
//    }
//    public void setResidentialStatus(String residentialStatus) {
//        this.residentialStatus = residentialStatus;
//    }
    public String getPfAccountNumber() {
        return pfAccountNumber;
    }

    public void setPfAccountNumber(String pfAccountNumber) {
        this.pfAccountNumber = pfAccountNumber;
    }

    public String getUanNumber() {
        return uanNumber;
    }

    public void setUanNumber(String uanNumber) {
        this.uanNumber = uanNumber;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getDateOfLeaving() {
        return dateOfLeaving;
    }

    public void setDateOfLeaving(String dateOfLeaving) {
        this.dateOfLeaving = dateOfLeaving;
    }

    public String getDateOfConfirmation() {
        return dateOfConfirmation;
    }

    public void setDateOfConfirmation(String dateOfConfirmation) {
        this.dateOfConfirmation = dateOfConfirmation;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

//    public String getPayroll() {
//        return payroll;
//    }
//    public void setPayroll(String payroll) {
//        this.payroll = payroll;
//    }
    public String getStrategicBusinessUnit() {
        return strategicBusinessUnit;
    }

    public void setStrategicBusinessUnit(String strategicBusinessUnit) {
        this.strategicBusinessUnit = strategicBusinessUnit;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public String getDivison() {
        return divison;
    }

    public void setDivison(String divison) {
        this.divison = divison;
    }

    public String getSubDivision() {
        return subDivision;
    }

    public void setSubDivision(String subDivision) {
        this.subDivision = subDivision;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFunctionalGrouping() {
        return functionalGrouping;
    }

    public void setFunctionalGrouping(String functionalGrouping) {
        this.functionalGrouping = functionalGrouping;
    }

    public String getSubDepartment() {
        return subDepartment;
    }

    public void setSubDepartment(String subDepartment) {
        this.subDepartment = subDepartment;
    }

    public String getSubLevel() {
        return subLevel;
    }

    public void setSubLevel(String subLevel) {
        this.subLevel = subLevel;
    }

    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

//    public String getAssignmentNumber() {
//        return assignmentNumber;
//    }
// public void setAssignmentNumber(String assignmentNumber) {
//        this.assignmentNumber = assignmentNumber;
//    }

    @Override
    public String toString() {
        return "Employee{" + "employeeCode=" + employeeCode + ", firstName=" + firstName + ", lastName=" + lastName + ", salutation=" + salutation + ", gender=" + gender + ", employmentType=" + employmentType + ", company=" + company + ", dateofBirth=" + dateofBirth + ", age=" + age + ", email=" + email + ", panNumber=" + panNumber + ", pfAccountNumber=" + pfAccountNumber + ", uanNumber=" + uanNumber + ", dateOfJoining=" + dateOfJoining + ", dateOfLeaving=" + dateOfLeaving + ", dateOfConfirmation=" + dateOfConfirmation + ", mobileNumber=" + mobileNumber + ", organization=" + organization + ", location=" + location + ", designation=" + designation + ", positionCode=" + positionCode + ", grade=" + grade + ", strategicBusinessUnit=" + strategicBusinessUnit + ", zone=" + zone + ", businessUnit=" + businessUnit + ", cluster=" + cluster + ", divison=" + divison + ", subDivision=" + subDivision + ", department=" + department + ", functionalGrouping=" + functionalGrouping + ", subDepartment=" + subDepartment + ", subLevel=" + subLevel + ", employeeStatus=" + employeeStatus + ", employmentStatus=" + employmentStatus + ", accountNumber=" + accountNumber + ", accountType=" + accountType + ", bankName=" + bankName + ", branchName=" + branchName + ", ifscCode=" + ifscCode + ", accountHolderName=" + accountHolderName + ", paymentMode=" + paymentMode + ", reportingManagerName=" + reportingManagerName + ", reportingManagerCode=" + reportingManagerCode + ", middleName=" + middleName + ", nationality=" + nationality + ", operations=" + operations + ", martialStatus=" + martialStatus + ", systemCode=" + systemCode + ", section=" + section + '}';
    }

   
  

    

   

}
