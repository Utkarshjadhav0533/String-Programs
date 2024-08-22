package com.interviewpracticde;

public class ReverseString1 {

    public static void main(String[] args) {
        String str = "Pro-Wings";
        String reverse=reverseString(str);
        System.out.println(reverse);
        
        
        
    }
    
    public static String reverseString(String str) {
    	
    	
		/* 1st way */
		/*
		 * String s=new StringBuffer(str).reverse().toString(); 
		 * return s;
		 */
    	
    	
		/* 2nd way */
		/*
		 * StringBuffer sb=new StringBuffer(str); 
		 * String s1=sb.reverse().toString();
		 * return s1;
		 */
		 
    	
		/* 3rd way */
		 StringBuffer sb=new StringBuffer(str); sb.reverse(); 
		 return sb.toString();
		 
    	
    	
    }
}
