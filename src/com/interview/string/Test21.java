package com.interview.string;

import java.util.HashMap;
import java.util.Map;

public class Test21 {
    public static void main(String[] args) {
        String input ="aabbaaa";
        String occ = findOccOfEachChar(input);
        System.out.println(occ);
    }

    private static String findOccOfEachChar(String input) {

        /*Map<Character, Integer> characterIntegerMap = new HashMap<>();

        for(char ch : input.toCharArray()) {
            characterIntegerMap.put(ch, characterIntegerMap.getOrDefault(ch, 0) + 1);
        }

           StringBuilder stringBuilder = new StringBuilder();
            for(Map.Entry<Character, Integer> entry
                : characterIntegerMap.entrySet()) {

                stringBuilder.append(entry.getKey());
                stringBuilder.append(entry.getValue());

            }

       return stringBuilder.toString();*/

        StringBuilder resilt = new StringBuilder();
      //  StringBuilder sb = new StringBuilder();
        char ch = input.charAt(0);
      //  sb.append(ch);
        int count = 1;

for(int i = 1 ; i < input.length();i++) {

    char nextChr = input.charAt(i);
    if (nextChr == ch) {
        count++;
    } else {
       // if (count > 1) {
            resilt.append(ch).append(count);
     //   }


      //  sb = new StringBuilder();
        ch = nextChr;
        count = 1;
      //  sb.append(ch);
    }
}
//if(count > 1){
    resilt.append(ch).append(count);
//}
        return resilt.toString();
    }
}


//aaa 					a3
//aabbcc					a2b2c2
//aaabcdd					a3b1c1d2
//a						a1
//aabbaaa					a2b2a3