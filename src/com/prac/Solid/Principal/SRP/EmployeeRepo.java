package com.prac.Solid.Principal.SRP;

public class EmployeeRepo {

    public void save(EmployeeData employeeData){
        System.out.println("Employee data added = "+employeeData.getEmpId());
    }
}
