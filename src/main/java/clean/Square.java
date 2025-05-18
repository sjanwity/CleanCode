package main.java.clean;

public class Square implements Shape {
	
	private int width;
	private int corners;
	
	public Square(int width) {
		this.width = width;
		this.corners = 4;
	}

	@Override
	public double area() {
		
		return width * width;
	}

	@Override
	public int corners() {
		
		return corners;
	}

}
