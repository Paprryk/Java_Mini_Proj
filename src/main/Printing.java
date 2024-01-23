package main;

import items.Book;

public class Printing {
	public static void main(String[] args) {
		Item i1 = new Book("Book", "Patryk F", "Test", "Horror");
		System.out.println(i1);
	}
}
