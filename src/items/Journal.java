package items;

import main.Item;

public class Journal extends Item {

	private String publisher;

	public Journal(String type, String author, String title, String publisher) {
		super(type, author, title);
		this.publisher = publisher;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Publisher: " + this.publisher);
	}

	@Override
	public String toString() {
		return "Journal [publisher=" + publisher + ", Type=" + getType() + ", Author=" + getAuthor() + ", Title="
				+ getTitle() + "id=" + getId() + "]";
	}

}
