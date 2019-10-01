package refactown.cleancode.c06objects.envy;

import java.time.LocalDate;

import refactown.cleancode.c06objects.book.Geometry;
import refactown.cleancode.c06objects.book.Shape;

public class FeatureEnvy {

	public boolean isValidOrder(AnemicOrder order) {
		return !order.isCancelled() && LocalDate.now().isBefore(order.getDate().plusDays(365)); 
	}
	
	public static double calculateArea(Object shape) {
		if (shape instanceof HibridSquare) {
			HibridSquare s = (HibridSquare)shape;
			return s.getSide() * s.getSide(); // s.side
		} else if (shape instanceof HybridRectangle) {
			HybridRectangle r = (HybridRectangle) shape;
			return r.getHeight() * r.getWidth(); 
		} else if (shape instanceof HybidCircle) {
			HybidCircle c = (HybidCircle) shape;
			return Geometry.PI * c.getRadius() * c.getRadius();
		}
		throw new IllegalArgumentException("Unknown shape class:" + shape.getClass());
	}
}

class HibridSquare implements Shape{

	private double side; // mutable

	public HibridSquare(double side) {
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

class HybridRectangle implements Shape {

	private final double height; // immutable
	private final double width; // immutable

	public HybridRectangle(double height, double width) {
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

class HybidCircle implements Shape{
	
	private final double radius;

	public HybidCircle(double radius) {
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



