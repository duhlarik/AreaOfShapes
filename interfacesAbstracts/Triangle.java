package interfacesAbstracts;

public class Triangle extends Shape {

	@Override
	public double getArea() {
		return (1/2) * (base * height);
	}
	
	public Triangle(double base, double height, String name) {
		setBase(base);
		setHeight(height);
		setName(name);
	}

	private double base;
	private double height;
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	

}
