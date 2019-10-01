package refactown.cleancode.c06objects.book;

public class Circle { // Java common implementation
	
	private final double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

}

class StructCircle { // Java "Struct"
	
	public final double radius;

	public StructCircle(double radius) {
		super();
		this.radius = radius;
	}
}
