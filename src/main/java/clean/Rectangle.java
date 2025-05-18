package main.java.clean;

public class Rectangle implements Shape{

	private int width;
	private int height;
	private int corners;
	
	public Rectangle(int height, int width) {
		this.width = width;
		this.height = height;
		this.corners = 4;
	}
	@Override
	public double area() {
		return width * height;
	}

	@Override
	public int corners() {
		return corners;
	}

}
