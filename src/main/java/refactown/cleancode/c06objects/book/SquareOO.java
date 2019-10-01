package refactown.cleancode.c06objects.book;

public class SquareOO implements Shape{

	private double side; // mutable

	public SquareOO(double side) {
		super();
		this.side = side;
	}

	@Override
	public double area() {
		return side * side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
}
