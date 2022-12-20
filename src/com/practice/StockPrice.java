package com.practice;

public class StockPrice {
	private double price;
	private int shares;
	private double capital;

	public double getPrice() {
		return price;
	}

	public int getShares() {
		return shares;
	}

	public void buy(double price, int shares) {
		this.shares += shares;
		this.price = price;
		this.capital += shares * price;
	}

	public void sell(double price, int shares) {
		this.shares -= shares;
		this.price = price;
		capital -= shares * price;
	}

	public double getAveragePrice() {
		return capital / getShares();
	}

}
