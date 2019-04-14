package refactown.cleancode.c10classes

open class Player(val name: String) {

    open fun play(): Hand = Hand.randomHand()

    override fun toString(): String = name
}