package com.recursion;

public class TowerOfHanoi {
    public static void main(String...args){
        int noOfRings = 3;//The logic will work for any no of rings
        playTOH("A", "C", "B", noOfRings);
    }

    private static void playTOH(String A, String C, String B, int ring) {
        if (ring==1){
            System.out.println("From: "+A+" to: "+C+" ring: "+ring);
        } else {
            playTOH(A, B, C, ring-1);
            System.out.println("From: "+A+" to: "+C+" ring: "+ring);
            playTOH(B, C, A, ring-1);
        }
    }
}
