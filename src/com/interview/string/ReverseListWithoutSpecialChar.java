package com.interview.string;



public class ReverseListWithoutSpecialChar {

    public static void main(String[] args) {

        String str = "s@t%p#$r";
        String st = findReverse(str);
        System.out.println(st);
       // O/P: r@p%t#$s
    }

    private static String findReverse(String str) {

        char[] ch = str.toCharArray();
        int left = 0;
        int right = str.length() -1;

        while(left < right){

            if(!Character.isLetter(ch[left])){
                left++;
            } else if(!Character.isLetter(ch[right])){
                right--;
            }else{
                char temp ;
                temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }


        return new String(ch);
    }
}