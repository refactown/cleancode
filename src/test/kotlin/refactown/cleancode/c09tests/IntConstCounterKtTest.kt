package refactown.cleancode.c09tests

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.time.Month

internal class IntConstCounterKtTest {

    @Test
    fun testCountIntConstV1() {
        assertEquals(1, countIntConstV1(Class1::class.java))
    }

    @Test
    fun testCountIntConstV1Refac() {
        assertEquals(1, countIntConstV1Refac(Class1::class.java))
    }

    @Test
    fun testCountIntConstV2() {
        assertEquals(-1, countIntConstV2(List::class.java))
        assertEquals(-1, countIntConstV2(Month::class.java))
        assertEquals(1, countIntConstV2(Class1::class.java))
    }

    @Test
    fun testCountIntConstV3() {
        assertEquals(-1, countIntConstV3(List::class.java))
        assertEquals(-1, countIntConstV3(Month::class.java))
        assertEquals(1, countIntConstV3(Class1::class.java))
        assertEquals(3, countIntConstV3(Class2::class.java))
    }
}

internal open class Class1 {
    val CONST1 = 1000
}

internal class Class2: Class1(){
    val CONST2 = 2000
    val CONST3 = 3000
}

