package com.interview.string;

public class Test1222 {
    public static void main(String[] args) {
        int num = 1010;
        for(int i =1 ; i < num ; i++){
            int temp = num - i;
            if(checkZero(i) && checkZero(temp)){
                System.out.println( i+" ,"+ temp);
                break;
            }
        }
    }
    private static boolean checkZero(int num) {
        while (num > 0 ){
            if(num %10 == 0){
                return false;
            }
            num = num/10;
        }
        return true;
    }
}


//Given a number. Find a pair of numbers such that its sum is the given number and those numbers
// should not have '0' as any of its digit.
//   1010 ==> {[999, 11]}