package com.prac.Solid.Principal.LSP;

public class InHouseProduct extends Product{

    @Override
    public double getDiscount() {
        discount =this.extraDiscount();
        return discount;
    }


    public double extraDiscount(){
        discount = discount*1.5;
        return discount;
    }
}
