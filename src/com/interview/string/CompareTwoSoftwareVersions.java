package com.interview.string;

import java.util.Arrays;

public class CompareTwoSoftwareVersions {
    public static void main(String[] args) {
        String version1 = "1.0", version2 = "1";

        String higherVersion = compareVersions(version1, version2);
        System.out.println(higherVersion);
    }

    private static String compareVersions(String version1, String version2) {

        String[] v1part = version1.split("\\.");
        String[] v2part = version2.split("\\.");

        int minLength = Math.min(v1part.length, v2part.length);

        for(int i = 0 ; i < minLength ; i ++){
            int v1 = Integer.parseInt(v1part[i]);
            int v2 = Integer.parseInt(v2part[i]);


            if(v1 < v2){
                return version2;
            }else if(v1 > v2){
                return version1;
            }
        }

        if(v1part.length < v2part.length){
            return version2;
        }else if(v1part.length > v2part.length){
            return version1;
        }else{
            return "both are equals";
        }
    }
}
