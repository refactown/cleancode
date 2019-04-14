package refactown.cleancode.c10classes

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MatchTest {

    @Test
    fun testPlay() {
        val bill = MockPlayer("Bill", Hand.PAPER)
        val bob = MockPlayer("Bob", Hand.ROCK)
        val match = Match(bill,bob)
        assertEquals(MatchResult.SECOND_WINS, match.play())
    }
}

class MockPlayer(name: String, private val hand: Hand)
    : Player(name) {
    override fun play() = hand
}