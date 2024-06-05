package com.prac.Solid.Principal.OCP;

public class HealthInsuranceCustomerProfile implements CustomerProfile{
    @Override
    public boolean isLoyel(CustomerProfile profile) {

        return false;
    }
}
