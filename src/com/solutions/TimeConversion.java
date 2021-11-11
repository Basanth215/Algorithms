package com.solutions;

/*
Convert time from 12 hour time to 24 hour time
 */

public class TimeConversion {
    public static void main(String...args) {
        System.out.println(convert("12:20:10PM"));
    }

    public static String convert(String s){
        String hourTime = s.substring(0,2);
        String remainTime = s.substring(2,8);
        if (s.contains("PM")) {
            hourTime = hourTime.contains("12") ? "12" : String.valueOf(12 + Integer.parseInt(hourTime));
        } else {
            if(hourTime.contains("12")){
                hourTime = "00";
            }
        }
        return hourTime +remainTime;
    }

}
