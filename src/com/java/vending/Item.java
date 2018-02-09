package com.java.vending;

public enum Item {
	
	CHIPS(2.0),
	COKE(1.5),
	CANDY(1.0),
	BARS(2.5);
	
	//private final String name;
	private final Double price;
	
	public Double getPrice() {
		return price;
	}

	private Item(Double price){
		//this.name = name;
		this.price = price;
	}

}
