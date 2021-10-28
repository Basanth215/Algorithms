package com.recursion;

public class ReverseGivenNumber {
    static int reverse(int n)
    {
        if (n < 10)
            return n;
        int lengthOfANumberN = Integer.toString(n).length()-1;
        return (int) ((n % 10)*Math.pow(10,lengthOfANumberN) + reverse(n / 10));
    }

    public static void main(String...args)
    {
        int num = 12345;
        int result = reverse(num);
        System.out.println("Reverse of a given number " +
                num + " is " + result);
    }
}
