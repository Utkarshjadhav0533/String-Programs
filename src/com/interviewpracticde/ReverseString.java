package com.interviewpracticde;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Pro-Wings";
        String afterReverse=reverseString(str);
        System.out.println(afterReverse);
        
    }

    public static String reverseString(String str) {
        String empty = "";

        for (int i =8; i >= 0; i--) {
            empty += str.charAt(i);
        }

        //System.out.println(empty);
        return empty;
    }
}
