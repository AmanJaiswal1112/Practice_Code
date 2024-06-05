package com.prac.Solid.Principal.OCP;

public class HealthInsuranceCalculatePreminum {

    public int calculateDiscountInsurancePremium(CustomerProfile customerProfile){
        if(customerProfile.isLoyel(customerProfile))
        return 20;
        else{
            return 10;
        }
    }
}
