package refactown.cleancode.c06objects

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PersonTest{

    @Test
    fun testBadCode() {
        val personKotlin = Person("Bill", 25, "Rio de Janeiro")
		//val personKotlin = Person("Bill", 25, "Rio de Janeiro")
        val personJava = PersonJ("Bill", 25, "Rio de Janeiro")
        assertNotEquals(personKotlin, personJava)
        assertEquals(personKotlin.name, personJava.name)
        assertEquals(personKotlin.age, personJava.age)
        assertEquals(personKotlin.city, personJava.city)
    }
}