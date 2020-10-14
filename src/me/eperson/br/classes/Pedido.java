package me.eperson.br.classes;

import java.util.ArrayList;

public class Pedido {
	ArrayList<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void removeItem(Item item) {
		items.remove(item);
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}
	
	public float getValorTotal() {
		float sum = 0;
		for (Item i : items)
			sum += i.getPrice();
		return sum;
	}
}
