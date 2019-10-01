package refactown.cleancode.c06objects.book;

public class Geometry {
	
	public static final double PI = 3.1416;
	
	public static double calculateArea(Object shape) {
		if (shape instanceof Square) {
			Square s = (Square)shape;
			return s.getSide() * s.getSide(); // s.side
		} else if (shape instanceof Rectangle) {
			Rectangle r = (Rectangle) shape;
			return r.getHeight() * r.getWidth(); 
		} else if (shape instanceof Circle) {
			Circle c = (Circle) shape;
			return PI * c.getRadius() * c.getRadius();
		}
		throw new IllegalArgumentException("Unknown shape class:" + shape.getClass());
	}

}
