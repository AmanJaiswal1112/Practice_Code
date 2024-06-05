package com.prac.Solid.Principal.ISP;

public class CannanPrinter implements IPrint{
    @Override
    public void getPrint() {
        System.out.println("Printing.....");
    }

    @Override
    public void getCommonTask() {
        System.out.println("Common Tax.....");
    }
}
