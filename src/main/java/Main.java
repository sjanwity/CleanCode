package main.java;

import java.util.ArrayList;
import java.util.List;

import main.java.clean.Circle;
import main.java.clean.Rectangle;
import main.java.clean.Shape;
import main.java.clean.Square;
import main.java.clean.Triangle;

public class Main {
	List<Shape> shapes = new ArrayList<>();

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	
	private void run() {
		double sum = 0;
		createData();
		for (Shape shape : shapes) {
			sum = sum + shape.area();
		}
		System.out.println("The total area is: " + sum);
		
	}
	
	private void createData()
	{
		shapes.add(new Circle(7));
		shapes.add(new Circle(3));
		shapes.add(new Circle(14));
		shapes.add(new Rectangle(12,6));
		shapes.add(new Triangle(20,12));
		shapes.add(new Square(65));
		
		
	}

}
