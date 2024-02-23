package com.prac.String;

public class PermutationOfString {
    public static void main(String[] args) {
        String str = "ABC";
        int len = str.length();
        System.out.println("All the permutations of the string are: ");
        generateAllPermutation(str, 0, len);
    }
    private static void generateAllPermutation(String str, int start, int end) {

        if(start == end){
            System.out.println(str);
        }else{
            for (int i = start  ; i < end ; i++){
                str = swapInput(str , start , i);
                generateAllPermutation(str, start+1 , end);
                str = swapInput(str , start , i);
            }
        }
    }
    private static String swapInput(String str, int i, int end) {
        char[] chars = str.toCharArray();
        char temp;
        temp = chars[i];
        chars[i] = chars[end];
        chars[end] = temp;
        return String.valueOf(chars);
    }
}


//ABC  A , Bc