package com.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
/*
    Given a square matrix, calculate the absolute difference between the sums of its diagonals
 */
public class DiagonalDifference {
    public static void main(String...args){
        List<List<Integer>> list =
                Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(3,4,5),Arrays.asList(4,5,6));
        System.out.println(findDiagonalDiff(list));
    }

    private static int findDiagonalDiff(List<List<Integer>> arr) {
        int arrSize = arr.size();
        int forwardDiagonal = IntStream.range(0,arrSize).map(i -> arr.get(i).get(i)).sum();
        int backwardDiagonal = IntStream.range(0,arrSize).map(i -> arr.get(i).get(arrSize-i-1)).sum();

        return Math.abs(forwardDiagonal-backwardDiagonal);
    }
}
