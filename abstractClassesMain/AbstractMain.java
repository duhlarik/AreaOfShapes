package abstractClassesMain;

import java.text.DecimalFormat;

import interfacesAbstracts.*;

public class AbstractMain {

	public static void main(String[] args) {

		Shape[] shapeArray = new Shape[5];
		/*
		 * we are not creating an object out of Shape we are creating references
		 * to an array
		 */
		DecimalFormat df = new DecimalFormat("#.000");

		shapeArray[0] = new Rectangle(12, 10, "r1");
		shapeArray[1] = new Rectangle(4, 5, "r2");
		shapeArray[2] = new Circle(3, "c1");
		shapeArray[3] = new Triangle(10, 6, "t1");
		shapeArray[4] = new Triangle(3, 7, "t2");

		double totalArea = 0;

		for (int i = 0; i < shapeArray.length; i++) {

			totalArea += shapeArray[i].getArea();

		}
		System.out.println(df.format(totalArea));
	}

}
