package com.juanpabloprado.strings;

import java.util.stream.IntStream;

public class Main {

    static boolean isPalindrome(String original) {
        String normalized = original.toLowerCase();
//        StringBuilder reversed = new StringBuilder();
        StringBuilder reversed = new StringBuilder(normalized).reverse();
//        for (int i = normalized.length() - 1; i >= 0; i--) {
//            reversed.append(normalized.charAt(i));
//        }
        return normalized.contentEquals(reversed);
    }

    static boolean isPalindrome2(String original) {
        String normalized = original.toLowerCase();
//        int start = 0, end = normalized.length() - 1;
//        while (start < end) {
//            if (normalized.charAt(start) != normalized.charAt(end)) {
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
        return IntStream.range(0, normalized.length() / 2)
                .allMatch(i -> normalized.charAt(i) == normalized.charAt(normalized.length() - i - 1));
    }

    static int countVowels(String s) {
        String vowels = "aeiou";
        String normalized = s.toLowerCase().trim();
        return (int) normalized.chars().filter(c -> vowels.indexOf(c) >= 0).count();
    }

    public static void main(String[] args) {
        String firstName = "Shelly";
        String lastName = "Parker";

        String name = firstName + " " + lastName;
        System.out.println(name);

        String concatName = firstName.concat(" ").concat(lastName);
        System.out.println(concatName);

        StringBuilder stringBuilder = new StringBuilder("abc");
        stringBuilder.append("def");
        stringBuilder.append("ghi");
        stringBuilder.insert(0, "xyz");
        stringBuilder.delete(3, 6);
        String alpha = stringBuilder.toString();
        System.out.println(alpha);

        StringBuffer stringBuffer = new StringBuffer("abc");
        stringBuffer.append("def");
        stringBuffer.append("ghi");
        stringBuffer.insert(0, "xyz");
        stringBuffer.delete(3, 6);
        String beta = stringBuffer.toString();
        System.out.println(beta);

        String original = "madam";
        boolean result = isPalindrome2(original);
        System.out.println(result);

        original = "Civic";
        System.out.println(isPalindrome2(original));

        String s = "Hello";
        System.out.println(countVowels(s));
    }
}
