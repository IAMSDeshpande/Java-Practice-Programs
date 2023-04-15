/**
 * 
 */
package com.practiceprograms.basic;

import java.util.Scanner;

/**
 * @author Sachin Deshpande
 *
 */
public class PalindromeString {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string to validate for palindrom");
		Scanner scan = new Scanner(System.in);
		String value = scan.nextLine();
		char[] arrChar = value.toCharArray();
		StringBuilder builder = new StringBuilder();
		for (int i = arrChar.length-1; i >= 0; i--) {
			builder.append(arrChar[i]);
		}
		if (value.equals(builder.toString())) {
			System.out.println(value + " is palindrom");
		} else {
			System.out.println(value + " is not palindrom");
		}
	}

}
