package com.interviewpracticde;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s ="listen           ";
		String s1="silent           ";
		
		boolean isAnagram=anagram(s, s1);
		System.out.println(isAnagram);
		

	}

	private static boolean anagram(String s, String s1) {
		
		char [] a=s.toCharArray();
		char [] b=s1.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		//System.out.println(Arrays.toString(a));
		//System.out.println(Arrays.toString(b));
		
		return Arrays.equals(a, b);
	}

}
