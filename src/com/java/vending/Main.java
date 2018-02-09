package com.java.vending;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VendingMachine vm = new VendingMachineImpl();
		
		vm.addItemToCart(Item.CHIPS, 2);
		vm.addItemToCart(Item.CANDY, 3);
		vm.insertCoin(Coin.DIME);
		vm.insertCoin(Coin.DIME);
		vm.insertCoin(Coin.DIME);
		vm.insertCoin(Coin.DIME);
	}

}
