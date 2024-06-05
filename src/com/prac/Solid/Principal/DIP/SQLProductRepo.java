package com.prac.Solid.Principal.DIP;

import java.util.Arrays;
import java.util.List;

public class SQLProductRepo implements ProductRepo{
    public List<String> getAllProductName(){
        return Arrays.asList("AC", "Cooler", "Fan");
    }
}
