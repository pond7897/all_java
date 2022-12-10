package FinalEx;

public class Cylinder extends Circle{
	private double height = 1.0;
	
	public Cylinder() {
		super();
		setHeight(height);
	}
	public Cylinder(double radius) {
		super(radius);
		setHeight(height);
	}
	public Cylinder(double radius, double height) {
		super(radius);
		setHeight(height);
	}
	public Cylinder(double radius, double height, String color){
		super(radius, color);
		setHeight(height);
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
		double volume = super.getArea()*height;
		return volume;
	}
	@Override
	public String toString() {      // in Cylinder class
	   return String.format("Cylinder: subclass of %s height = %.2f",super.toString(),height);
	}

}
