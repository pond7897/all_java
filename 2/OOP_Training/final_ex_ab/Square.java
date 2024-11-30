package final_ex_ab;

public class Square extends Rectangle {
	private double side = 0.0;

	public Square() {
		super();
	}

	public Square(double side) {
		super(side, side);
	}

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);

	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public void setWidth(double side) {
		super.setWidth(side);
	}

	public void setLength(double side) {
		super.setLength(side);
	}

	public String toString() {
		return String.format("Square[%s, width= %.2f, length= %.2f]", super.toString(),
				super.getWidth(),
				super.getLength());
	}
}
