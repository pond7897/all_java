package final_ex;

public class Book {
	private String isbn;
	private String name;
	private Author author;
	private double price;
	private int qty = 0;

	public Book(String isbn, String name, Author author, double price) {
		this.isbn = isbn;
		this.author = author;
		this.name = name;
		setPrice(price);
	}

	public Book(String isbn, String name, Author author, double price, int qty) {
		this.name = name;
		this.isbn = isbn;
		this.author = author;
		setPrice(price);
		setQty(qty);
	}

	public String getISBN() {
		return isbn;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getAuthorName() {
		return author.getName();
	}

	public String toString() {
		return String.format("Book[isbn= %s, name= %s, %s, price= %.1f, qty= %d]",
				getISBN(),
				getName(),
				author.toString(),
				getPrice(),
				getQty());
	}
}
