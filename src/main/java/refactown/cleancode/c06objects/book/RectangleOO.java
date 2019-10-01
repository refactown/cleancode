package refactown.cleancode.c06objects.book;

public class RectangleOO implements Shape {

	private final double height; // immutable
	private final double width; // immutable

	public RectangleOO(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}
	
	@Override
	public double area() {
		return height * width;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

}
