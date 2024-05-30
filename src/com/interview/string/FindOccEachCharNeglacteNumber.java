package com.interview.string;

public class FindOccEachCharNeglacteNumber {
    public static void main(String[] args) {
        System.out.println("Hello");

        String str = "A1b2c3A4a5C6";
        findOccEachCharNeglacteNumber(str);

    }

    private static void findOccEachCharNeglacteNumber(String str) {

        str = str.toLowerCase();

        int[] charCount = new int[26];


        for(int i = 0 ; i < str.length() ; i++){
            char ch  = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                charCount[ch - 'a']++;
            }
        }

        for(char ch = 'a' ; ch <= 'z' ; ch++){
            if(charCount[ch - 'a'] > 0){
                System.out.println(ch+" =" +charCount[ch-'a']);
            }
        }

    }

}
