package com.practice;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class BudgetAllocation {

	public static void main(String[] args) {
		// Accept input from user

		System.out.println("How much can you spend this month?");
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		// variables
		double spendingTotal = scanner.nextDouble();
		double sumOfProportions = 0;
		int index = 0;
		ArrayList<Double> proportions = new ArrayList<>();

		// Accepts percentage proportions from user
		System.out.println("Enter the proportions for your mothly expenses:");
		System.out.println("NOTE: Total proportion must not exceed 100%!");

		// Handles user inputs for proportion
		do {
			double proportionInput = scanner.nextDouble();
			proportions.add(proportionInput);
			System.out.println("Your proportion input " + (index + 1) + " is " + proportionInput);
			sumOfProportions += proportions.get(index);
			index++;
		} while (sumOfProportions <= 100);
		scanner.close();

		// Handles sum of proportions OVER 100%

		if (sumOfProportions > 100) {
			double cumulativeSum = 0.0;
			for (int j = 0; j < proportions.size() - 1; j++) {
				cumulativeSum += proportions.get(j);
			}
			proportions.set(proportions.size() - 1, 100 - cumulativeSum);
		}

		// Allocates spending amount by inputed proportions
		for (double proportion : proportions) {
			double expense = (proportion * spendingTotal) / 100.0;
			System.out.println("Expense for " + proportion + " is " + df.format(expense));
		}

	}


}
