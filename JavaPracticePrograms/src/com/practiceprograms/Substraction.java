/**
 * 
 */
package com.practiceprograms;

import java.util.Scanner;

/**
 * @author Sachin Deshpande
 *
 */
public class Substraction {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers for Substraction");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.format("Substraction for %d and %d is %d ", num1, num2, num1 - num2);
	}

}
