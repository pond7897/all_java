package FinalExAu;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty = 0;
	
	public Book(String name, Author[] authors, double price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	public Book(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public Author[] getAuthors() {
		return authors;
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
	public String getAuthorNames() {
		String Au = "";
		for (Author au : authors){Au = au.getName();}
		return String.format("%s", Au);
	}
	@Override
	public String toString() {
		String AuName = "";
		for (Author au : authors) {
			AuName += au.toString()+ ", ";
		}
		return String.format("Book[name= %s, author={%s}, price= %.1f, qty= %d]",
				getName(),
				AuName,
				getPrice(),
				getQty());
	}
	

}
