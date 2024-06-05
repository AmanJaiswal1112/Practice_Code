package com.prac.Solid.Principal.OCP;

public class OCPClient {
    public static void main(String[] args) {

        HealthInsuranceCalculatePreminum healthInsuranceCalculatePreminum = new HealthInsuranceCalculatePreminum();
        System.out.println(healthInsuranceCalculatePreminum.calculateDiscountInsurancePremium(new HealthInsuranceCustomerProfile()));

    }
}
