package com.prac.String;


    import java.util.*;
    import java.util.stream.Collectors;

public class GroupWordsByLength {
        public static void main(String[] args) {

            String str ="NareshReddy";

            Map<Character, Long> charCount = str.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
            System.out.println(charCount);

            // Example input string array
            String[] words = {"apple", "banana", "pear", "fig", "kiwi", "grape", "mango", "berry"};

            // Grouping words by their length using a HashMap
            Map<Integer, List<String>> wordsByLength = new HashMap<>();

            for (String word : words) {
                int length = word.length();
                // If the map already contains the length, add the word to the list
                if (!wordsByLength.containsKey(length)) {
                    wordsByLength.put(length, new ArrayList<>());
                }
                wordsByLength.get(length).add(word);
            }

            // Printing words grouped by their length
            List<List<String>> list = new ArrayList<>();
           //    List<String> innerList = new ArrayList<>();
            list.add(new ArrayList<>());
            list.add(new ArrayList<>());
            list.add(new ArrayList<>());
            list.add(new ArrayList<>());
            list.add(new ArrayList<>());
            list.add(new ArrayList<>());
            list.add(new ArrayList<>());
            list.add(new ArrayList<>());
            list.add(new ArrayList<>());
            list.add(new ArrayList<>());




            for (Map.Entry<Integer, List<String>> entry : wordsByLength.entrySet()) {
                System.out.println("Words of length " + entry.getKey() + ": " + entry.getValue());
                list.add(entry.getKey(), entry.getValue());

            }
            System.out.println(list);
        }
    }


