package com.anýl.conditions;
import java.util.Scanner;

public class ProductExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int z;

		System.out.println("Please enter the firt number : ");

		x = input.nextInt();

		System.out.println("Please enter the second number : ");

		y = input.nextInt();

		System.out.println("Please enter the third number : ");

		z = input.nextInt();

		int result = x + y + z;

		System.out.println("Product is :" + result);

	}

}
