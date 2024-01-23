package items;

import main.Item;

public class Magazine extends Item {
	private int pages;

	public Magazine() {
		super();
	}

	public Magazine(String type, String author, String title, int pages) {
		super(type, author, title);
		this.pages = pages;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Pages: " + this.pages);
	}

	@Override
	public String toString() {
		return "Magazine [pages=" + pages + ", Type=" + getType() + ", Author=" + getAuthor() + ", Title=" + getTitle()
				+ "id=" + getId() + "]";
	}

}
