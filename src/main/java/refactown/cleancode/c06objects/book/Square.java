package refactown.cleancode.c06objects.book;

public class Square {

	private double side; // mutable

	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

}
