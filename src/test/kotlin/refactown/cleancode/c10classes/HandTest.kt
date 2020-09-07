package refactown.cleancode.c10classes

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HandTest {

    @Test
    fun testBeats() {
        assertTrue(Hand.ROCK beats Hand.SCISSORS)
        assertTrue(Hand.SCISSORS.beats(Hand.PAPER))
        assertTrue(Hand.PAPER.beats(Hand.ROCK))
    }
}