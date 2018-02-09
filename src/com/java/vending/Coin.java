package com.java.vending;

public enum Coin {
	
	PENNY(0.01),
	NICKEL(0.05),
	DIME(0.1),
	QUARTER(0.25);
	
	double coinValue;
	
	public double getCoinValue() {
		return coinValue;
	}

	Coin(double value){
		this.coinValue = value;
	}

}
