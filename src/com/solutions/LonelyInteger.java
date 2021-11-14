package com.solutions;

/*
Given an array of integers, where all elements but one occur twice, find the unique element.
a = [1,2,3,4,3,2,1]
The unique element is 4.
*/


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {

    public static void main(String...args) {
        List<Integer> l = Arrays.asList(1,2,3,4,3,2,1);
        System.out.println(findLonelyInteger(l));
    }

    private static int findLonelyInteger(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer ele;
        for (int a : arr) {
            ele = map.get(a);
            map.put(a,ele==null?1:ele+1);
        }
        for (int m : map.keySet()) {
            ele = map.get(m);
            if(ele==1){
                return m;
            }
        }
        return 0;
    }
}
