package refactown.cleancode.c06objects

import java.lang.IllegalArgumentException

class MutableSquare(var side: Double) : Shape {
    override fun area() = side * side
}

class MutableRectangle(var height: Double, var width: Double) : Shape {
    override fun area() = height * width
}

class MutableCircle(var radius: Double) : Shape {
    override fun area() = PI * radius * radius
}

fun calculateAreaSideEffects(shape: Any): Double {
    return when (shape) {
        is MutableSquare -> ++shape.side * shape.side++
        is MutableRectangle -> ++shape.height * shape.width++
        is MutableCircle -> PI * ++shape.radius * shape.radius++
        else -> throw IllegalArgumentException()
    }
}