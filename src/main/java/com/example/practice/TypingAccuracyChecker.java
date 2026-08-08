package com.example.practice;

public class TypingAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {
        int matched = 0;
        int firstMismatch = -1;
        int maxLength = Math.max(original.length(), typed.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < original.length() && i < typed.length() && original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatch == -1) {
                firstMismatch = i;
            }
        }

        double accuracy = (matched * 100.0) / Math.max(1, original.length());

        System.out.printf("Matched: %d/%d%n", matched, original.length());
        System.out.printf("Accuracy: %.2f%%%n", accuracy);

        if (firstMismatch == -1) {
            System.out.println("No Mismatches");
        } else {
            char expected = firstMismatch < original.length() ? original.charAt(firstMismatch) : '?';
            char actual = firstMismatch < typed.length() ? typed.charAt(firstMismatch) : '?';
            System.out.println("First Mismatch at position "
                    + (firstMismatch + 1)
                    + " ('"
                    + expected
                    + "' vs '"
                    + actual
                    + "')");
        }
    }

    public static void main(String[] args) {
        String original = "hello world";
        String typed = "hello worlt";
        checkTypingAccuracy(original, typed);
    }
}
