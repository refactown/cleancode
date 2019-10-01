package refactown.cleancode.c06objects.book;

public class Rectangle {

	private final double height; // immutable
	private final double width; // immutable

	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

}
