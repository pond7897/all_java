package midterm;

public class Cycle {
	private double area;
	private int radius;
	
	public Cycle() {
		this.area = 0.0;
		this.radius = 0;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getDiameter(int radius) {
		area = 2*(3.14)*radius;
		return area;
	}
	public int getRadius() {
		return radius;
	}
	public double getArea() {
		return area;
	}
}
