package final_ex_ab;

public class Circle extends Shape {
	protected double radius = 1.0;

	public Circle() {
		super();
		setRadius(radius);
	}

	public Circle(double radius) {
		super();
		setRadius(radius);
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return String.format("Circle[%s, radius= %.2f]",
				super.toString(),
				getRadius());
	}
}
