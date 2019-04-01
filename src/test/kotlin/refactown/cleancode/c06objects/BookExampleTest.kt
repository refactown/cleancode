package refactown.cleancode.c06objects

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BookExampleTest {

    @Test
    fun proceduralExample() {
        val square = Square(3.0)
        val rectangle = Rectangle(2.0, 4.5)
        val circle = Circle(2.0)

        assertEquals(calculateArea(square), 9.0)
        assertEquals(calculateArea(rectangle), 9.0)
        assertEquals(calculateArea(circle), 12.5664)
    }

    @Test
    fun ooExample() {
        val square = SquareOO(3.0)
        val rectangle = RectangleOO(2.0, 4.5)
        val circle = CircleOO(2.0)

        assertEquals(square.area(), 9.0)
        assertEquals(rectangle.area(), 9.0)
        assertEquals(circle.area(), 12.5664)
    }

}