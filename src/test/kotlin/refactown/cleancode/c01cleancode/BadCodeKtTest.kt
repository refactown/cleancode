package refactown.cleancode.c01cleancode

import org.junit.jupiter.api.Assertions.*
import java.util.ArrayList
import java.time.Month
import org.junit.jupiter.api.Test


internal class BadCodeKtTest {

    @Test
    fun testBooleanFields() {
        assertEquals(-1, constants(null))
        assertEquals(-1, constants(List::class.java))
        assertEquals(-1, constants(Month::class.java))

        assertEquals(0, constants(Any::class.java))

        assertEquals(4, constants(ArrayList::class.java))
    }

}