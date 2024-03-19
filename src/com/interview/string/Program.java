package com.interview.string;
import java.util.HashMap;

import java.util.Map;

public class Program
{
    public static void main(String[] args)
    {
            /*
             * A string S consisting of uppercase English letters is given. In one move we can delete seven letters from S, forming the word "BALLOON"
                (one 'B', one 'A', two 'L's, two 'O's and one 'N), and leave a shorter word in S. If the remaining letters in the shortened S are sufficient to allow
                another instance of the word "BALLOON to be removed, pext move can be done. What is the maximum number of such moves that we can apply to s?
             */

        String s = "NAABXXAN";
        int result = Program.solution(s);
        System.out.println(result);
    }

//TOTO


        public static int solution(String s) {

            // Count the frequency of each letter in the string

            Map<Character, Integer> letterCount = new HashMap<>();

            for (char c : s.toCharArray()) {

                letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);

            }

            // Calculate the maximum number of moves

            int maxMoves = Integer.MAX_VALUE;

            maxMoves = Math.min(maxMoves, letterCount.getOrDefault('B', 0));

            maxMoves = Math.min(maxMoves, letterCount.getOrDefault('A', 0));

            maxMoves = Math.min(maxMoves, letterCount.getOrDefault('L', 0) / 2);

            maxMoves = Math.min(maxMoves, letterCount.getOrDefault('O', 0) / 2);

            maxMoves = Math.min(maxMoves, letterCount.getOrDefault('N', 0));

            return maxMoves;

        }

    }