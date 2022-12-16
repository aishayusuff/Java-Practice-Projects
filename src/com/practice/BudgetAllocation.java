package com.practice;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class BudgetAllocation {

	public static void main(String[] args) {
		System.out.println("How much can you spend this month?");
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double spendingTotal = scanner.nextDouble();
		double sumOfProportions = 0;
		int i = 0;

		ArrayList<Double> proportions = new ArrayList<>();
		System.out.println("Enter the proportions for your mothly expenses:");
		System.out.println("NOTE: Total proportion must not exceed 100%!");

		//	Handling user inputs for proportion

		do {
			double proportionInput = scanner.nextDouble();
			proportions.add(proportionInput);
			System.out.println("Your proportion input " + (i + 1) + " is " + proportionInput);
			sumOfProportions += proportions.get(i);
			i++;
		} while (sumOfProportions <= 100);
		scanner.close();

		// Handling sum of proportions OVER 100%

		if (sumOfProportions > 100) {
			double cumulativeSum = 0.0;
			for (int j = 0; j < proportions.size() - 1; j++) {
				cumulativeSum += proportions.get(j);
			}
			proportions.set(proportions.size() - 1, 100 - cumulativeSum);
		}

		// Allocating spending by inputed proportions
		for (double proportion : proportions) {
			double expense = (proportion * spendingTotal) / 100.0;
			System.out.println("Expense for " + proportion + " is " + df.format(expense));
		}

	}


}
