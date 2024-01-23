package items;

import main.Item;

public class Book extends Item {

	private String genre;

	public Book() {
		super();
	}

	public Book(String type, String author, String title, String genre) {
		super(type, author, title);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Genre: " + this.genre);
	}

	@Override
	public String toString() {
		return "Book [genre=" + genre + ", Type=" + getType() + ", Author=" + getAuthor() + ", Title=" + getTitle()
				+ "id=" + getId() + "]";
	}

}
