package final_ex_ab;

public abstract class Shape {
	protected String color = "red";
	protected Boolean filled = true;

	public Shape() {
		this.color = "red";
		this.filled = true;
	}

	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public abstract double getArea();

	public abstract double getPerimeter();

	public String toString() {
		return String.format("Shape[color= %s, filled= %b]",
				getColor(),
				isFilled());
	}
}
