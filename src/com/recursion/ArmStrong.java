package com.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArmStrong {
    public static void main(String...main){
        List<Integer> l = Arrays.asList(3, 12, 86, 341);
        List<String> s = armstrongNumber(l);
    }
    public static List<String> armstrongNumber(List<Integer> arr) {
        // Write your code here
        List<String> s = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            System.out.println(power(arr.get(i)));
            if(power(arr.get(i))==arr.get(i)){
                s.add("Armstrong number");
            } else
            {
                s.add("Not Armstrong number");
            }
        }
        return s;
    }

    private static int power(int i) {

        return i==0 ? 0 : (int) (Math.pow((i % 10), 3) + power(i / 10));
    }
}
