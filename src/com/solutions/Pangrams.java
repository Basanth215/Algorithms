package com.solutions;

import java.util.Locale;
import java.util.stream.IntStream;

public class Pangrams {
    public static void main(String...args) {
        String s = "We promptly judged antique ivory buckles for the next prize";
        System.out.println(findPangram(s));
    }

    private static String findPangram(String s) {
        String allCharacters = "abcdefghijklmnopqrstuvwxyz";
        String lowers = s.toLowerCase(Locale.ROOT);
        long count = IntStream.range(0,allCharacters.length()).filter(i->lowers.contains(allCharacters.substring(i,i+1))).count();
        return (count==26) ? "pangram": "not pangram";
    }
}
