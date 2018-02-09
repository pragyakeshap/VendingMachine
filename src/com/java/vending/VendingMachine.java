package com.java.vending;

import java.util.List;

public interface VendingMachine {
	
	public double getItemPrice(Item item);	
	public double getTotalPrice(List<Item> items);
	public boolean addItemToCart(Item i, int quan);
	public void insertCoin(Coin coin);
	public List<Coin> takeBalance();
	public boolean coinAccepted();
	public void reset();
	public Cart getCart();
}
