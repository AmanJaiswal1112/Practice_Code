package com.prac.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FlattenArray {
    public static void main(String[] args) {
        Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
        List<Object> temp = (List<Object>) flattenArray(array);
        System.out.println(temp);

        Integer[][][] arr = {
                {
                    {1,2,3},{4,5,6}
                },
                {
                        {11,12,13},{14,15,16}
                }
        } ;

        List<Object> temp1 = flattenArray(arr);
        System.out.println(temp1);

    }

    private static List<Object> flattenArray(Object[] array) {

        List<Object> list = new ArrayList<>();
        for(int i = 0 ; i < array.length ; i++){
            if(!array[i].getClass().isArray()){
                list.add(array[i]);
            }else{
                list.addAll( flattenArray((Object[]) array[i]));
            }


        }
        return list;
    }
}
