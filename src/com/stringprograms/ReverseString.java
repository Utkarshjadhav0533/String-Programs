package com.stringprograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String s ="vaibhav";
		
	String rev=	reversedString(s);
	System.out.println(rev);

}

	private static String reversedString(String s) {
		// TODO Auto-generated method stub
		String s1="";
				for(int i=s.length()-1;i>=0;i--)
				{
					s1+=s.charAt(i);
				}
		return s1;
	}
}