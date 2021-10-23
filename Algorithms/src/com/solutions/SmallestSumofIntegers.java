package com.solutions;

/*
find the smallest number which sum of a individual digits are equal to the given number N
 */

public class SmallestSumofIntegers {
    public int solution(int N) {

        int digits = N/9;
        if(N%9!=0){
            digits++;
        }
        int small = 1;

        int finalDigit = 0;
        while(digits>=1) {
            while (small<9 && N - small > 9*(digits-1)) {
                small++;
            }
            finalDigit += small *Math.pow(10,digits-1);
            digits--;
            small=1;
        }
        return finalDigit;
    }
    public static void main(String...args){
        SmallestSumofIntegers s = new SmallestSumofIntegers();
        System.out.println(s.solution(8));
    }
}
