package com.stringprograms;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		
		
		String s1="listen";
		String s2="silent  ";
	boolean anagram=isAnagram(s1,s2);
	if(anagram)
		System.out.println("anagram");
	else
		System.out.println("Not Anagram");
	}

	private static boolean isAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		char[]charArray1=s1.toCharArray();
		char[]charArray2=s2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);
	}
}
