package com.prac.Solid.Principal.LSP;

import java.util.ArrayList;
import java.util.List;

public class LSPClient {
    public static void main(String[] args) {

        Product fisrt = new Product();
        Product second = new Product();
        Product third = new InHouseProduct();
        Product forth = new OutSourceProduct();

        List<Product> productList = new ArrayList<>();
        productList.add(fisrt);
        productList.add(second);
        productList.add(third);
        productList.add(forth);


        for (Product p: productList) {
            System.out.println(p.getDiscount());
        }
    }

        
}
