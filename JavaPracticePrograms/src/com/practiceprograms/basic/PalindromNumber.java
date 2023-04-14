/**
 * 
 */
package com.practiceprograms.basic;

import java.util.Scanner;

/**
 * @author Sachin Deshpande
 *
 */
public class PalindromNumber {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number to check palindrom or not");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int reverse = 0;
		int remainder;
		int temp = num;
		while (temp != 0) {
			remainder = temp % 10;
			reverse = reverse * 10 + remainder;
			temp /= 10;
		}
		if (num == reverse) {
			System.out.println(num + " number is palindrom");
		} else {
			System.out.println(num + " number is not palindrom");
		}
	}

}
