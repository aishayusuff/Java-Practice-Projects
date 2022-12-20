package com.practice;

import java.text.DecimalFormat;

public class AverageStock {

	public static void main(String[] args) {
		StockPrice companyA = new StockPrice();
		DecimalFormat df = new DecimalFormat("0.00 ");

		companyA.buy(45.6, 2000);
		companyA.buy(36.7, 5000);
		companyA.sell(51.4, 2500);
		System.out.println("Shares left: " + companyA.getShares());
		System.out.println("Selling prices for current shares: " + companyA.getPrice());
		System.out.println("Average price for buying and selling shares: " + df.format(companyA.getAveragePrice()));


	}

}
