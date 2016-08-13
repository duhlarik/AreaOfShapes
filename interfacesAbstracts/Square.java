package interfacesAbstracts;

public class Square extends Rectangle {
	
	public double getArea() {
		return Math.pow(getLength(), 2);
	}

	public Square(double length, double width, String name) {
		super(length, width, name);
		setLength(length);
		setWidth(length);
		setName(name);
	}

}
