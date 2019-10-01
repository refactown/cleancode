package refactown.cleancode.c06objects.book;

import static org.junit.jupiter.api.Assertions.*;
import static refactown.cleancode.c06objects.book.Geometry.calculateArea;

import org.junit.jupiter.api.Test;

class GeometryTest {

	@Test
	void proceduralExample() {
		Square square = new Square(3.0);
		Rectangle rectangle = new Rectangle(2.0, 4.5);
		Circle circle = new Circle(2.0);

		assertEquals(calculateArea(square), 9.0);
		assertEquals(calculateArea(rectangle), 9.0);
		assertEquals(calculateArea(circle), 12.5664);
	}

	@Test
	void ooExample() {
		SquareOO square = new SquareOO(3.0);
		RectangleOO rectangle = new RectangleOO(2.0, 4.5);
		CircleOO circle = new CircleOO(2.0);

		assertEquals(square.area(), 9.0);
		assertEquals(rectangle.area(), 9.0);
		assertEquals(circle.area(), 12.5664);
	}

}
