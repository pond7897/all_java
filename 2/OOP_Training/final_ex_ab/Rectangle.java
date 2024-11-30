package final_ex_ab;

public class Rectangle extends Shape {
	protected double width = 1.0;
	protected double length = 1.0;

	public Rectangle() {
		setWidth(width);
		setLength(length);
	}

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return width * length;
	}

	public double getPerimeter() {
		return 2 * (width + length);
	}

	public String toString() {
		return String.format("Rectangle[%s, width= %.1f, length= %.1f]",
				super.toString(),
				getWidth(),
				getLength());
	}
}