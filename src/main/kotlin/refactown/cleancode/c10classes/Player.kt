package refactown.cleancode.c10classes

import java.time.LocalDateTime

class Player(val name: String) {

    fun play(): Hand = Hand.randomHand()

    override fun toString(): String = name
}