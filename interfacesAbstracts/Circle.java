package interfacesAbstracts;

public class Circle extends Shape {

	@Override
	public double getArea() {
		
		return Math.PI * Math.pow(radius, 2);
	}
	
	public Circle(double radius, String name) {
		setRadius(radius);
		setName(name);
	}

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
