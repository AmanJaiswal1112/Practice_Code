package com.prac.String;

public class DummyPermute {
    public static void main(String[] args) {
        String str = "ABC";
        int len = str.length();
        getpermute(str, 0, len);
    }

        public static void getpermute(String str, int start, int end) {
            if (start == end) {
                System.out.println(str);
            } else {
                for (int i = start; i < end; i++) {
                    str = swap(str, start, i);
                    getpermute(str, start + 1, end);
                    str = swap(str, start, i);
                }
            }
        }
    public static String swap(String str, int start, int end){
        char[] ch = str.toCharArray();
        char temp = ch[start];
        ch[start] = ch[end];
        ch[end] = temp;

        return String.valueOf(ch);
    }
}

