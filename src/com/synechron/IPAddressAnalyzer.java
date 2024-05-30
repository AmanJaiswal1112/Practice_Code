package com.synechron;

import java.util.HashMap;
import java.util.Map;

public class IPAddressAnalyzer {
    public static String findMostFrequentIPAddress(String[] log) {
        // Create a HashMap to store the count of each IP address
        Map<String, Integer> ipCountMap = new HashMap<>();

        // Iterate through the log and count the occurrences of each IP address
        for (String ip : log) {
            ipCountMap.put(ip, ipCountMap.getOrDefault(ip, 0) + 1);
        }

        // Find the IP address with the maximum occurrence
        String mostFrequentIP = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : ipCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentIP = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostFrequentIP;
    }

    public static void main(String[] args) {
        // Example log data
        String[] log = {
                "192.168.1.1",
                "192.168.1.2",
                "192.168.1.1",
                "192.168.1.3",
                "192.168.1.2",
                "192.168.1.1"
        };

        String mostFrequentIP = findMostFrequentIPAddress(log);
        System.out.println("The most frequent IP address is: " + mostFrequentIP);
    }
}
