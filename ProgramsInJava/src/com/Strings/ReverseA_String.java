package com.Strings;

public class ReverseA_String {

	public static void main(String[] args) {
		
		String s= "hi hello";
		System.out.println(s.length());
		for(int i=s.length()-1; i>=0 ;i--) {
			System.out.print(s.charAt(i));
		}
	}
}
