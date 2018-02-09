package com.java.vending;

import java.util.List;

public class VendingMachineImpl implements VendingMachine{
	
	private Inventory<Coin> coinInventory = new Inventory<Coin>();
	private Inventory<Item> itemInventory = new Inventory<Item>();
	
	Cart cart = new Cart();
	
	long currentBalance;
	
	public long getCurrentBalance() {
		int balance = 0;
		for(Coin c : Coin.values()) {
			balance += c.getCoinValue();
		}
		currentBalance = balance;
		return currentBalance;
	}

	public Cart getCart() {
		return cart;
	}

	public VendingMachineImpl(){
		initialize();
	}
	
	private void initialize(){
		for(Coin c : Coin.values()){
			coinInventory.inventory.put(c, 5);
		}
		for(Item i : Item.values()){
			itemInventory.inventory.put(i, 10);
		}
	
	}

	@Override
	public double getItemPrice(Item item) {
		return itemInventory.inventory.get(item);
		 
	}

	@Override
	public double getTotalPrice(List<Item> items) {
		return cart.returnCartPrice(items);
	}

	@Override
	public boolean addItemToCart(Item i, int q) {		
		return cart.addToCart(i,q);
	}

	@Override
	public void insertCoin(Coin coin) {
		coinInventory.inventory.put(coin, 1);
	}

	@Override
	public List<Coin> takeBalance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean coinAccepted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

}
