package com.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SparseArray {
    public static void main(String...args) {
        SparseArray sparseArray = new SparseArray();
        List<String> strings = Arrays.asList("as", "sa");
        List<String> queries = Arrays.asList("", "", "");
        sparseArray.matchingStrings(strings, queries);
    }

    private List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> numb = new ArrayList<>();
        int count = 0;
        for (String q : queries) {
            count += strings.stream().filter(s -> s.equals(q)).count();
            numb.add(count);
        }


        return numb;
    }
}
