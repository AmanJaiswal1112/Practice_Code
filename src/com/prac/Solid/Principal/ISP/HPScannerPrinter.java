package com.prac.Solid.Principal.ISP;

public class HPScannerPrinter implements IScan, IPrint{
    @Override
    public void getScan() {
        System.out.println("Scanning.....");
    }

    @Override
    public void getCommonTask() {
        System.out.println("Common Tax.....");
    }

    @Override
    public void getPrint() {
        System.out.println("Printing.....");
    }
}
