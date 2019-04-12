package refactown.cleancode.c03functions

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FibonacciKtTest {

    @Test
    fun testFib() {
        assertEquals(0, fib(0))
        assertEquals(1, fib(1))
        assertEquals(1, fib(2))
        assertEquals(2, fib(3))
        assertEquals(3, fib(4))
        assertEquals(5, fib(5))
        assertEquals(8, fib(6))
        assertEquals(13, fib(7))
        assertEquals(21, fib(8))
        assertEquals(34, fib(9))
        assertEquals(55, fib(10))
    }

    @Test
    fun testSeq(){
        assertEquals("0,1,1,2,3,5", seq(5))
        assertEquals("0,1,1,2,3,5,8,13,21,34,55", seq(10))
        assertEquals("0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610," +
                "987,1597,2584,4181,6765,10946,17711,28657,46368,75025," +
                "121393,196418,317811,514229,832040,1346269,2178309,3524578," +
                "5702887,9227465,14930352,24157817,39088169,63245986,102334155", seq(40))
    }
}