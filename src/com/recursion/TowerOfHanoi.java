package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoi {
    public static void main(String...args){
        int noOfRings = 3;//The logic will work for any no of rings
        List<String> statements = new ArrayList<>();
        playTOH("A", "C", "B", noOfRings, statements);
        statements.stream().forEach(statement -> {
            String[] split = statement.split(",");
            System.out.println("from: "+split[0]+" to: "+split[1]+" ring: "+split[2]);
        });
    }

    private static void playTOH(String A, String C, String B, int ring, List<String> statements) {
        if (ring==1){
            statements.add(A+","+C+","+ring);
        } else {
            playTOH(A, B, C, ring-1, statements);
            statements.add(A+","+C+","+ring);
            playTOH(B, C, A, ring-1, statements);
        }
    }
}
