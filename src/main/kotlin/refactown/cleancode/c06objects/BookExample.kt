package refactown.cleancode.c06objects

import java.lang.IllegalArgumentException

data class Square(val side: Double)

data class Rectangle(val height: Double, val width: Double)

data class Circle(val radius: Double)

const val PI = 3.1416

fun calculateArea(shape: Any): Double {
    return when (shape) {
        is Square -> shape.side * shape.side
        is Rectangle -> shape.height * shape.width
        is Circle -> PI * shape.radius * shape.radius
        else -> throw IllegalArgumentException()
    }
}

interface Shape {   fun area(): Double }

class SquareOO(private val side: Double) : Shape {
    override fun area() = side * side
}

class RectangleOO(private val height: Double,
                 private val width: Double) : Shape {
    override fun area() = height * width
}

class CircleOO(private val radius: Double) : Shape {
    override fun area() = PI * radius * radius
}

