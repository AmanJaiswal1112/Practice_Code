package com.prac.Solid.Principal.DIP;

public class ProductFactory {

    public static ProductRepo create(){
        return new SQLProductRepo();
    }
}
