package main.java.clean;

public class Triangle implements Shape{
	private int width;
	private int height;
	private int corners;

	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		this.corners = 3;
	}

	@Override
	public double area() {
		return width*height/2;
	}

	@Override
	public int corners() {
		return corners;
	}

}
