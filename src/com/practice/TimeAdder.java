package com.practice;

import java.util.Scanner;

public class TimeAdder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Accepts User's current hour(s), minutes(s) and second(s)
		System.out.println("Enter current hour(s): ");
		int currentHour = scan.nextInt();
		System.out.println("Enter current minute(s): ");
		int currentMinute = scan.nextInt();
		System.out.println("Enter current second(s): ");
		int currentSecond = scan.nextInt();

		// Accepts User's proposed hour(s), minutes(s) and second(s) to increment by
		System.out.println("Enter proposed hour(s) to increment by: ");
		int proposedHour = scan.nextInt();
		System.out.println("Enter proposed Minute(s) to increment by: ");
		int proposedMinute = scan.nextInt();
		System.out.println("Enter proposed second(s) to increment by: ");
		int proposedSecond = scan.nextInt();

		// Handles carryover minute(s) and second(s)
		int carryoverMinute = 0, carryoverSecond = 0;
		boolean isNextDay = false;

		// Adds current and proposed hour(s), minute(s) and second(s)
		int totalSecond = currentSecond + proposedSecond;
		if (totalSecond >= 60) {
			totalSecond -= 60;
			carryoverSecond = 1;
		}
		int totalMinute = currentMinute + proposedMinute + carryoverSecond;
		if (totalMinute >= 60) {
			totalMinute -= 60;
			carryoverMinute = 1;
		}
		int totalHour = currentHour + proposedHour + carryoverMinute;
		if (totalHour >= 24) {
			totalHour -= 24;
			isNextDay = true;
		}
		if (isNextDay) {
			System.out.println(
					"The new time is: " + totalHour + "h: " + totalMinute + "m: " + totalSecond + "s the next day");
		} else {
			System.out.println("The new time is: " + totalHour + "h: " + totalMinute + "m: " + totalSecond + "s today");
		}
	}

}
