package com.prac.Solid.Principal.OCP;

public class VehcleInsuranceCustomerProfile implements CustomerProfile{


    @Override
    public boolean isLoyel(CustomerProfile profile) {
        return false;
    }
}
