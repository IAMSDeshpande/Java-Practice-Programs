/**
 * 
 */
package com.practiceprograms.basic;

import java.util.Scanner;

/**
 * @author Sachin Deshpande
 *
 */
public class PalindromeString2 {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string to validate for palindrom");
		Scanner scan = new Scanner(System.in);
		String value = scan.nextLine();
		String reverse = "";
		for (int i = (value.length() - 1); i >= 0; --i) {
			reverse += value.charAt(i);
		}
		if (value.toLowerCase().equals(reverse.toLowerCase())) {
			System.out.println(value + " is palindrom");
		} else {
			System.out.println(value + " is not palindrom");
		}
	}

}
