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
		int iterations = 50000;
		main.createData();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < iterations; i++)
		{
			main.run();
		}
		long endTime = System.currentTimeMillis();
		long durationMilis = endTime - startTime;
        System.out.println("Test completed:");
        System.out.println("Total time: " + durationMilis + " ms");
        System.out.println("Average time per call: " + (durationMilis / (double)iterations) + " ms");
  
		
	}
	
	private void run() {
		double sum = 0;
		
		for (Shape shape : shapes) {
			sum = sum + shape.area();
			sum = Math.round(sum);
		}
		
		System.out.println("The total area is: " + sum);
		
	}
	
	private void unclean() {
		
	}
	
	private void createData()
	{
	
		shapes.add(new Rectangle(12,6));
		shapes.add(new Triangle(20,12));
		shapes.add(new Square(65));
		shapes.add(new Circle(5.641896));
		shapes.add(new Circle(1.261566));
		shapes.add(new Circle(4.2190));
		shapes.add(new Circle(1.2615666));
	}

}
