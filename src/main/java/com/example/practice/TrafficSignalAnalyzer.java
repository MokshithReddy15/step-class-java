package com.example.practice;

public class TrafficSignalAnalyzer {

    public static void findLongestStreak(String signalLog) {
        char longestChar = signalLog.charAt(0);
        int longest = 1;

        char currentChar = signalLog.charAt(0);
        int current = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == currentChar) {
                current++;
            } else {
                if (current > longest) {
                    longest = current;
                    longestChar = currentChar;
                }

                currentChar = signalLog.charAt(i);
                current = 1;
            }
        }

        if (current > longest) {
            longest = current;
            longestChar = currentChar;
        }

        System.out.println("Longest Streak: '" + longestChar + "' repeated " + longest + " times");
    }

    public static void main(String[] args) {
        String signal = "RRGGGYRR";
        findLongestStreak(signal);
    }
}
