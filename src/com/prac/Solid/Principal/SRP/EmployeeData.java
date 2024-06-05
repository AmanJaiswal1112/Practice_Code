package com.prac.Solid.Principal.SRP;

public class EmployeeData {
    private int empId;
    private String name;
    private String address;

    public void save(EmployeeData employeeData){
        new EmployeeRepo().save(employeeData);
    }

    public void TaxCalculate(EmployeeData employeeData){
        new TaxCalculator().calculateTax(employeeData);
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public EmployeeData(int empId, String name, String address) {
        this.empId = empId;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmployeeData{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
