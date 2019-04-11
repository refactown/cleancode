package refactown.cleancode.c10classes

import java.time.LocalTime
import kotlin.random.Random

class Player(val name: String) {

    fun play(): Hand {
        Thread.sleep((7 * LocalTime.now().second).toLong())
        return Hand.values()[Random(name.hashCode() * LocalTime.now().second).nextInt(0, 2)]
    }

    override fun toString(): String = name
}