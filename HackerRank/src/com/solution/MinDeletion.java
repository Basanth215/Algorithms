package com.solution;

/*
Given a string s and an array of integers cost where cost[i] is the cost of deleting the ith character in s.

Return the minimum cost of deletions such that there are no two identical letters next to each other.

Notice that you will delete the chosen characters at the same time, in other words,
after deleting a character, the costs of deleting other characters will not change.



Example 1:
==========

Input: s = "abaac", cost = [1,2,3,4,5]
Output: 3
Explanation: Delete the letter "a" with cost 3 to get "abac" (String without two identical letters next to each other).

Example 2:
==========

Input: s = "abc", cost = [1,2,3]
Output: 0
Explanation: You don't need to delete any character because there are no identical letters next to each other.

Example 3:
==========

Input: s = "aabaa", cost = [1,2,3,4,1]
Output: 2
Explanation: Delete the first and the last character, getting the string ("aba").


 */

public class MinDeletion {

    public int minCost(String s, int[] cost) {
        int totalMin = 0, val = 0;
        boolean ind = false;
        int prev = 0;
        for (int i = 1; i < cost.length; i++) {
            if(s.charAt(i)==s.charAt(i-1)){
                if(ind){
                    val = Math.min(cost[i],prev);
                    totalMin += val;
                    prev = Math.max(cost[i], prev);
                } else {
                    val = Math.min(cost[i], cost[i - 1]);
                    totalMin += val;
                    ind = true;
                    prev = Math.max(cost[i], cost[i - 1]);
                }
            } else {
                ind = false;
            }
        }
        return totalMin;
    }

    public static void main(String...args){
        String s = "aaaaaaaaaaaaaa";
        int[] cost = {1,3,6,5,4,5,4,4,2,8,3,10,6,6};
        MinDeletion min = new MinDeletion();
        System.out.println(min.minCost(s, cost));
    }
}
