package com.practice;

import java.text.DecimalFormat;

public class AverageStock {

	public static void main(String[] args) {
		StockPrice companyA = new StockPrice();
		DecimalFormat df = new DecimalFormat("0.00 ");

		companyA.buy(36.6, 2000);
		companyA.buy(39.7, 4000);

		System.out.println(companyA.getShares());
		System.out.println(companyA.getPrice());
		System.out.println(df.format(companyA.getAveragePrice()));
		companyA.sell(42.9, 1000);

	}

}
