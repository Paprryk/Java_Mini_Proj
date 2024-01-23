package main;

import java.util.ArrayList;

public class Library {
	private ArrayList<Item> items = new ArrayList<>();
	private ArrayList<Item> checkedOut = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	public void removeItem(Item item) {
		items.remove(item);
	}

	public void removeItem(int id) {
		for (Item i : this.items) {
			if (id == i.getId()) {
				this.items.remove(i);
				return;
			}
		}
	}

	public void updateItem(Item item) {
		items.remove(item);
		items.add(item);
	}
}
