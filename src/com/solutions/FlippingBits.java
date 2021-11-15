package com.solutions;

/*You will be given a list of 32 bit unsigned integers.
Flip all the bits (1->0 and 0->1) and return the result as an unsigned integer.*/

import java.util.stream.IntStream;

public class FlippingBits {
    public static void main(String...args) {
        int val = 9;
        System.out.println(flipBits(val));
    }

    private static long flipBits(long num) {
        int count;
        long sum;
        StringBuilder ch = new StringBuilder();
        //Convert from base 10 to base 2 and also from 0 to 1;
        do{
            if(num%2==0){
                ch.append("1");
            } else {
                ch.append("0");
            }
            num/=2;
        }while(num>0);

        count = ch.length();

        sum = IntStream.range(0, count).filter(i -> '1' == ch.charAt(i)).mapToLong(i -> (long) Math.pow(2, i)).sum();

        sum += IntStream.range(count, 32).mapToLong(i -> (long) Math.pow(2, i)).sum();
        return sum;
    }
}
