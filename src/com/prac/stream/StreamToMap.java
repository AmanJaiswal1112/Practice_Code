package com.prac.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamToMap {
    public static void main(String[] args) {
        String input = "Geeks for Geek";
        System.out.println(toMap(input));
        User user1 = new User(1, "User1", "Pune");
        User user2 = new User(2, "User2", "Mumbai");
        User user3 = new User(3, "User3", "Nagpur");
        User user4 = new User(4, "User4", "Pune");
        User user5 = new User(5, "User5", "Mumbai");
        toMap(user1, user2, user3).forEach((integer, user) -> System.out.println(user));

        System.out.println(toMap(user1, user2, user3, user4, user5));
        System.out.println(toMapcityUserCountMap(user1, user2, user3, user4, user5));
    }

    private static Map<String, List<User>> toMap(User user1, User user2, User user3, User user4, User user5) {
        Map<String, List<User> > cityMap = Arrays.asList(user1,user2,user3,user4,user5)
                .stream()
                .collect(Collectors.groupingBy(user -> user.getCity()));
        return cityMap;
    }

    private static Map<String, Long> toMapcityUserCountMap(User user1, User user2, User user3, User user4, User user5) {
        Map<String, Long > cityUserCountMap = Arrays.asList(user1,user2,user3,user4,user5)
                .stream()
                .collect(Collectors.groupingBy(user -> user.getCity(), Collectors.counting()));
        return cityUserCountMap;
    }

    private static Map<Integer, User> toMap(User user1, User user2, User user3) {
        Map<Integer, User> userMap = Arrays.asList(user1, user2, user3)
                .stream()
                .collect(Collectors.toMap(user -> user.getUserId(), user->user))
                ;
        return userMap;
    }

    public static Map toMap(String input) {
        Map<String, Integer> lengthMap = Arrays.asList(input.split(" "))
                .stream()
                .collect(Collectors.toMap(user -> user, user -> user.length()));
        return lengthMap;
    }
}

 class User {

    // Attributes of the user class
    private int userId;
    private String name;
    private String city;

    // Constructor
    public User(int userId, String name,
                String city)
    {
        this.userId = userId;
        this.name = name;
        this.city = city;
    }

    // Getters of the user class
    public int getUserId() { return userId; }

    public String getName() { return name; }

    public String getCity() { return city; }

    // Overriding the toString method
    // to return the custom string
    @Override
    public String toString()
    {
        return "User [userId = "
                + userId + ", name = "
                + name + ", city = "
                + city + "]";
    }
}