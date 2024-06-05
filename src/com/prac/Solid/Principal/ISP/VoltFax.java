package com.prac.Solid.Principal.ISP;

public class VoltFax implements IFax{
    @Override
    public void getFax() {
        System.out.println("Fax.....");
    }

    @Override
    public void getCommonTask() {
        System.out.println("Common Tax.....");
    }
}
