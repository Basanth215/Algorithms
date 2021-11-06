package com.solutions;
/*
Print min number of elements to be changed to make array contains alternative 1's 0's
Example: [1,0,1,0,1,1] to make this array contains alternative 1's 0's
then only 1 element is required to change [1,0,1,0,1,0]
Example: [1,1,0,1,1] to make this array contains alternative 1's 0's
then min 2 elements are required to change those are 1st and last elements [0,1,0,1,0]
 */
public class Alternative1sAnd0s {
    public static void main(String...args){
        Alternative1sAnd0s c = new Alternative1sAnd0s();
        int[] a = {1,1,0,1,1};
        System.out.println(c.solution(a));
    }

    private int solution(int...A) {
        int result=0;
        int[] temp = new int[A.length];
        System.arraycopy(A,0,temp,0,A.length);
        result = findNoOfSwaps(A,0);
        return Math.min(findNoOfSwaps(temp, 1),result);
    }
    int findNoOfSwaps(int[] A, int val){
        int result=0;
        for(int i=0;i<A.length;i++){
            if(val==A[i]){
                result++;
                A[i]=A[i]==1?0:1;
            }
            val = A[i];
        }
        return result;
    }
}
