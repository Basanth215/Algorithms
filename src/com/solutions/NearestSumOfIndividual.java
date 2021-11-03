package com.solutions;
/*
    Find a number which sum of individual digits are equal to the double the sum of a digits of a given number N
    example: If N = 13 then output = 17 where 1+3 = 4 and 1+7 = 8,
     which is double to the given number's sum of individual digits which is 8
     if n = 23 then output = 28, 2+3 =5 and 2+8=10
 */
public class NearestSumOfIndividual {
    public static void main(String...args){
        System.out.println(solve(18));
    }

    private static int solve(int N) {
        int toFind = 2 * sumOfIndividual(N);
        int n = 0;
        while(toFind!=n){
            n = sumOfIndividual(++N);
        }
        return N;
    }

    private static int sumOfIndividual(int n) {
        return n<10 ? n : n%10+sumOfIndividual(n/10);
    }
}
