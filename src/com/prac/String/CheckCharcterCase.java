package com.prac.String;

public class CheckCharcterCase {
    public static void main(String[] args) {
        char ch;
        ch = 'A';
        check(ch);
        ch = 'a';
        check(ch);
        ch = '0';
        check(ch);
    }

    static void check(char ch)
    {//65 - 91  97-122
        if (ch >= 'A' && ch <= 'Z')
            System.out.println("\n" + ch + " is an UpperCase character");

        else  if (ch >= 'a' && ch <= 'z')
            System.out.println("\n" + ch + " is an LowerCase character");
        else
            System.out.println("\n" + ch + " is an Alphanumeric character");
    }
}