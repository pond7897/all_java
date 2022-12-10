package FinalEx;

import java.lang.Math;

public class Circle {
	private double radius = 1.0;
	private String color = "red";

	public Circle() {
		setRadius(radius);
		setColor(color);
	}
	public Circle(double radius) {
		setRadius(radius);
		setColor(color);
	}
	public Circle(double radius, String color) {
		setRadius(radius);
		setColor(color);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		double Area = Math.PI*Math.pow(radius, 2);
		return Area;
	}
	public String toString() {
		return String.format("Circle[radius = %.2f, color = %s]", getRadius(), getColor());
	}
}
