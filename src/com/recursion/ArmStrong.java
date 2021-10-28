package com.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArmStrong {
    public static void main(String...main){
        List<Integer> l = Arrays.asList(3, 12, 86, 341);
        System.out.println(armstrongNumber(l));
    }
    public static List<String> armstrongNumber(List<Integer> arr) {
        List<String> s = new ArrayList<>();
        arr.forEach(sa->{
                if(power(sa)==sa) {
                    s.add("Armstrong number");
                }else {
                    s.add("Not armstrong");
                }
        });
        return s;
    }

    private static int power(int i) {

        return i==0 ? 0 : (int) (Math.pow((i % 10), 3) + power(i / 10));
    }
}
