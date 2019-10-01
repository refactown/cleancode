package refactown.cleancode.c06objects.book;

public class CircleOO implements Shape{
	
	private final double radius;

	public CircleOO(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		return Geometry.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}
}
