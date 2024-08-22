package com.interviewpracticde;

public class Palindrome {

	public static void main(String[] args) {

		String str = "madam";
		boolean b=palindrome(str);
		System.out.println(b);

	}

	private static boolean palindrome(String str) {

		int left = 0;
		int right = str.length() - 1;

		while (left < right) {

			if (str.charAt(left) != str.charAt(right)) 

				return false;

				left++;
				right--;
			
		}
			
			return true;
		}

		
}


