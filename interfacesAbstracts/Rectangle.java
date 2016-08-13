package interfacesAbstracts;

public class Rectangle extends Shape {

	@Override
	public double getArea() {
		
		return length * width;
	}
	
	public Rectangle (double length, double width, String name) {
		
		setLength(length);
		setWidth(width);
		setName(name);
	}
	
	private double length;
	
	private double width;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
