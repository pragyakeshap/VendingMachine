package com.java.vending;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {

	Map<Item, Integer> itemsInCart = new HashMap<Item, Integer>();

	public double returnCartPrice(List<Item> itemsInCart) {
		double sum = 0.0;
		if(itemsInCart.isEmpty()){
			return 0.0;
		}else{
			for(int i = 0; i < itemsInCart.size() ; i++){
				Item it = itemsInCart.get(i);				
				double price = it.getPrice();
				sum += price ;
			}
		}
		return sum;
	}

	public boolean addToCart(Item item , int q) {
		if(itemsInCart.get(item) == null){
			itemsInCart.put(item, q);
		}else {
			int qu = itemsInCart.get(item);
			itemsInCart.put(item, qu + q);
		}
		return true;
	}

	public boolean removeFromCart(Item item) {
		if(itemsInCart.get(item) == null){
			System.out.println("Item not present in cart");
			return false;
		}else {
			itemsInCart.remove(item);
		}
		return true;
	}

}
