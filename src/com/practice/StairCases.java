package com.practice;

import java.util.Scanner;

public class StairCases {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your desired number of stairs? ");
		int stairsNumber = scanner.nextInt();
		System.out.println("What is your desired stairs width? ");
		int stairsWidth = scanner.nextInt();
		System.out.println();

		// Using Nested FOR loop
		for (int i = 1; i <= stairsNumber; i++) {
			for (int j = 1; j <= i * stairsWidth; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Using Repeat method

		String stairsBlock = "*".repeat(stairsWidth);

		for (int i = 0; i < stairsNumber; i++) {
			System.out.println(stairsBlock + "*".repeat(i * stairsWidth));
		}

	}

}
