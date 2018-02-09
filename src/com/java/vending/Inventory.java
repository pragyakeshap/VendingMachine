package com.java.vending;

import java.util.HashMap;
import java.util.Map;

public class Inventory<T> {
	
	Map<T, Integer> inventory = new HashMap<T, Integer>();
	
	public Map<T, Integer> getInventory() {
		return inventory;
	}

	public Integer getQuantity(T item){
		if(inventory.containsKey(item)){
			return inventory.get(item);
		}else{
			return 0;
		}
	}


}
