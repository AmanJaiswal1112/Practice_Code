package com.interview.string;

public class Test30 {
    public static void main(String[] args) {
        String s = "abbcddea";
        char status = findNonRepeatChar(s);
        System.out.println(status);
    }

    private static char findNonRepeatChar(String s) {
        int[] count = new int[256];





        for(char c : s.toCharArray()){
            count[c]++;
        }

        for(char ch : s.toCharArray()){
            if(count[ch] == 1){
                return ch;
            }
        }
        return '0';
    }
}



//List<Emp> list = new ArrayList<>();


//list
// .stream()
// .filter(e->e.getAge() > 35)
// map(p->p.getName)
// .collect(Collectors.toList());