package com.solutions;

class StringPalindrome {
    public static void main(String...args){
        StringPalindrome sol = new StringPalindrome();
        System.out.println(sol.solution(9, 3));
    }

    private String solution(int N, int K) {
        StringBuilder s = new StringBuilder();
        String res = "";

        for (int i = 0; i<K; i++) {
            int num = 97+i;
            s = s.append(Character.toString((char) num));
        }

        if(N<K){
            return "";
        }
        int t = 0;
        for (int i = 0; i < N/2; i++) {
            if(t==K){
                t = 0;
            }
            res += s.charAt(t);
            t++;
        }

        StringBuilder resu = new StringBuilder(res);
        resu = resu.reverse();

        if(N%2!=0){
            res += "a";
        }
        res += resu;
        return res;
    }
}
