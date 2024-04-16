package com.interview.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test72 {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "mobile"));
        productList.add(new Product(2, "charger"));

        Map<Integer, Product> productMap =covertListToMap(productList);
        System.out.println(productMap);
    }

    private static Map<Integer, Product> covertListToMap(List<Product> productList) {

        Map<Integer, Product> productMap = productList
                .stream()
                .collect(Collectors.toMap(Product::getId,
                       p->p ));

        return productMap;
    }
}

     class  Product {
    private  int id;
    private  String name;

    private Product(){}

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

}