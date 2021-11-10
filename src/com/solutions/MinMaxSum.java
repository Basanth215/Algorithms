package com.solutions;
/*
Credits: This problem was taken from hacker rank.

Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Example
arr=[1,3,5,7,9]
The minimum sum is 1+3+5+7=16 and the maximum sum is 3+5+7+9=24. The function prints
16 24

Function Description

Complete the miniMaxSum function in the editor below.

miniMaxSum has the following parameter(s):

arr: an array of 5 integers

Print

Print two space-separated integers on one line: the minimum sum and the maximum sum of 4 of 5 elements.

Input Format

A single line of five space-separated integers.

Constraints
1<=arr[i]<=10^9

Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
Explanation

The numbers are 1, 2, 3, 4, and 5. Calculate the following sums using four of the five integers:

Sum everything except 1, the sum is 2+3+4+5=14.
Sum everything except , the sum is 1+3+4+5=13.
Sum everything except , the sum is 1+2+4+5=12.
Sum everything except , the sum is 1+2+3+5=11.
Sum everything except , the sum is 1+2+3+4=10.
Hints: Beware of integer overflow! Use 64-bit Integer.
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        long min = IntStream.range(0, arr.size() - 1).mapToLong(arr::get).sum();
        long max = IntStream.range(1, arr.size()).mapToLong(arr::get).sum();
        System.out.println(min+" "+max);
    }
    public static void main(String...args){
        List<Integer> arr = Arrays.asList(1,2,3,8,5);
        miniMaxSum(arr);
    }
}
