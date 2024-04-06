package com.interview.string;

public class Test46 {
    public static void main(String[] args) {
        System.out.println("hello");

        customeFunctionalInterface customeFunctionalInterface = (a,b)-> {
            return a + b;
        };


        int result = oprate(5, 3, customeFunctionalInterface);
        System.out.println(result);
    }

    private static int oprate(int i, int i1, customeFunctionalInterface customeFunctionalInterface) {
        return customeFunctionalInterface.sum(1, i1);
    }
}

@FunctionalInterface
 interface customeFunctionalInterface{

    int sum(int a, int b);

}