package main;

public abstract class Item {

	private int id;
	private static int count = 1;
	private String type;
	private String author;
	private String title;

	public Item() {
		super();
		this.id = ++count;
	}

	public Item(String type, String author, String title) {
		super();
		this.id = ++count;
		this.type = type;
		this.author = author;
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.type = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.type = title;
	}

	public void print() {
		System.out.println("Item type: " + this.type);
		System.out.println("Author: " + this.author);
		System.out.println("Title: " + this.title);
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", type=" + type + ", author=" + author + ", title=" + title + "]";
	}

}
