package com.interviewpracticde;

public class Reverse2 {

	public static void main(String[] args) {
		
		String s="Sushant";
		
		String reverse=reverseString(s);
		System.out.println(reverse);
		
		
	}

	private static String reverseString(String s) {
		
		char [] a=s.toCharArray();
		System.out.println(a);
		char [] b=new char [a.length];
		for(int i=0; i<a.length ;i++) {
			
			b[i]=a[a.length-1-i];
			
			
		}
		
		return new String(b);
				
		
	}
	
	
}
