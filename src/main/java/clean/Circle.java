package main.java.clean;

public class Circle implements Shape {
	private int radius;
	private int corners;

	public Circle(int radius) {
		this.radius = radius;
		this.corners = 0;
	}

	@Override
	public double area() {
		return Math.pow(radius, 2)*Math.PI;
	}

	@Override
	public int corners() {
		return corners;
	}

}
