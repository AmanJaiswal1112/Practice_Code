package com.prac.Solid.Principal.SRP;

public class SRPClient {
    public static void main(String[] args) {

        EmployeeData employeeData = new EmployeeData(1, "aman", "Noida");
        employeeData.TaxCalculate(employeeData);
        employeeData.save(employeeData);
    }
}
