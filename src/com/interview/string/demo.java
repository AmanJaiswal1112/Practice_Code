package com.interview.string;

public class demo {
    public static void main(String[] args) {
        B b = new B("123");
        System.out.println(b.ss);
    }
}


class Ab {
    String ss ;
public Ab(){

}
    public Ab(String a){
        ss = a;
    }
}

class B extends Ab{
    String pp;
    public B(String dd){
        pp = dd;
    }
}