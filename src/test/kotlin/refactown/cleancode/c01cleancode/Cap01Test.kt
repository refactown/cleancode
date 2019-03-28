package refactown.cleancode.c01cleancode

import org.junit.jupiter.api.Assertions.*
import java.util.ArrayList
import java.time.Month
import org.junit.jupiter.api.Test


internal class Cap01Test {

    @Test
    fun testBadCode() {
        assertEquals(-1, constants(null))
        assertEquals(-1, constants(List::class.java))
        assertEquals(-1, constants(Month::class.java))

        assertEquals(0, constants(Any::class.java))

        assertEquals(4, constants(ArrayList::class.java))
    }

    @Test
    fun testrefactoring1() {
        assertEquals(-1, countIntConstants(null))
        assertEquals(-1, countIntConstants(List::class.java))
        assertEquals(-1, countIntConstants(Month::class.java))

        assertEquals(0, countIntConstants(Any::class.java))

        assertEquals(4, countIntConstants(ArrayList::class.java))
    }

    @Test
    fun testrefactoring2() {
        //assertEquals(-1, countIntegerConstants(null))
        assertEquals(-1, countIntegerConstants(List::class.java))
        assertEquals(-1, countIntegerConstants(Month::class.java))

        assertEquals(0, countIntegerConstants(Any::class.java))

        assertEquals(8, countIntegerConstants(ArrayList::class.java))
    }

}