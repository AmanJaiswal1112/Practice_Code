package com.prac.Solid.Principal.SRP;

public class TaxCalculator {

    public void calculateTax(EmployeeData employeeData){
        System.out.println("Tax calculated for emp = "+employeeData.getEmpId());
    }
}
