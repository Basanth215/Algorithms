package com.solutions;

/*

Problem is taken from Hackerrank.

* Lily likes to play games with integers. She has created a new game where she determines the difference between a number and its reverse. For instance, given the number , its reverse is . Their difference is . The number  reversed is , and their difference is .

She decides to apply her game to decision making. She will look at a numbered range of days and will only go to a movie on a beautiful day.

Given a range of numbered days,  and a number , determine the number of days in the range that are beautiful. Beautiful numbers are defined as numbers where  is evenly divisible by . If a day's value is a beautiful number, it is a beautiful day. Return the number of beautiful days in the range.

Function Description

Complete the beautifulDays function in the editor below.

beautifulDays has the following parameter(s):

int i: the starting day number
int j: the ending day number
int k: the divisor
Returns

int: the number of beautiful days in the range
Input Format

A single line of three space-separated integers describing the respective values of , , and .

Constraints

Sample Input

20 23 6
Sample Output

2
Explanation

Lily may go to the movies on days , , , and . We perform the following calculations to determine which days are beautiful:

Day 20 is beautiful because the following evaluates to a whole number: (20-2)/6=18/6=3
Day 21 is not beautiful because the following doesn't evaluate to a whole number: (21-12)/6 = 9/6 = 1.5
Day 22 is beautiful because the following evaluates to a whole number: (22-22)/6 = 0/6 = 0
Day 23 is not beautiful because the following doesn't evaluate to a whole number: (23-32)/6 = 9/6 = 1.5
Only two days,  and , in this interval are beautiful. Thus, we print  as our answer.
*
* */

public class BeautifulDaysAtTheMovies {

    public static void main(String[] args) {

        String[] firstMultipleInput = {"20", "23", "6"};

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        System.out.println(BeautifulDaysAtTheMovies.beautifulDays(i, j, k));


    }

    private static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for (int l = i; l <= j ; l++) {
            if((l-findReverse(l))%k==0){
                count++;
            }
        }
        return count;
    }

    private static int findReverse(int l) {
        int reverseNumber = 0;
        while(l!=0){
            reverseNumber = (reverseNumber*10)+(l%10);
            l = l/10;
        }
        return reverseNumber;
    }

}
