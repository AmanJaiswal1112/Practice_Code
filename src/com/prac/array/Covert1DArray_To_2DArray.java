package com.prac.array;

public class Covert1DArray_To_2DArray {
    public static void main(String[] args) {
        int[][] a =new int[5][3];
        int[] d ={10,20,30,40,50,60,70,80,90,100,110,120, 130, 140,150};

        int row   = a.length;
        int col = a[0].length;

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ;j++){
                        a[i][j] =d[(col*i +j)];
            }
        }
        System.out.println(a);
    }
}