package com.prac.Solid.Principal.LSP;

public class OutSourceProduct  extends Product{

    @Override
    public double getDiscount() {
        discount =this.extraDiscount();
        return discount;
    }

    public double extraDiscount(){
        discount = discount*1.25;
        return discount;
    }
}
