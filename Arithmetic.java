package com.csi.basic;

import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1;
		int fact = 1;

		System.out.println("Please Enter Your Choice : ");
		System.out.println("1. Square 2. Square Root 3. Cube 4. Factorial");
		int ch = sc.nextInt();

		switch (ch) {
		case 1: // Square
			System.out.println("Please Enter a NUmber : ");
			n1 = sc.nextInt();
			System.out.println("Square of the number is : " + n1 * n1);

			break;

		case 2: // Square Root
			System.out.println("Please Enter a Number : ");
			n1 = sc.nextInt();
			System.out.println("Square Root of the NUmber is : " + Math.sqrt(n1));

			break;

		case 3: // Cube
			System.out.println("Please Enter a Number : ");
			n1 = sc.nextInt();
			System.out.println("Cube of The Number is : " + n1 * n1 * n1);

			break;

		case 4: // Factorial
			System.out.println("Please Enter a Number : ");
			n1 = sc.nextInt();
			for (int i = 1; i <= n1; i++) {
				fact = fact * i;

			}
			System.out.println("Factorial of the Number is : " + fact);

			break;

		default:
			System.out.println("Try Again");

			break;

		}
	}
}
