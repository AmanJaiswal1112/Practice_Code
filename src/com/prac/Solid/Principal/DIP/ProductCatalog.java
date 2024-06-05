package com.prac.Solid.Principal.DIP;

import java.util.List;

public class ProductCatalog {

public void getAllProductName(){

        ProductRepo productRepo = ProductFactory.create();

        List<String> productList = productRepo.getAllProductName();
    System.out.println(productList);
}
}
