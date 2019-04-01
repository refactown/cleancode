package refactown.cleancode.c08boundary

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import refactown.cleancode.c06objects.Person

internal class GsonJsonParserTest {

    @Test
    fun toJson() {
        val parser = GsonJsonParser()
        val billPerson = Person("Bill", 25, "Rio de Janeiro")
        val billJson = "{\"name\":\"Bill\",\"age\":25,\"city\":\"Rio de Janeiro\"}"
        assertEquals(billJson, parser.toJson(billPerson))
    }

    @Test
    fun fromJson() {
        val parser = GsonJsonParser()
        val billPerson = Person("Bill", 25, "Rio de Janeiro")
        val billJson = "{\"name\":\"Bill\",\"age\":25,\"city\":\"Rio de Janeiro\"}"
        assertEquals(billPerson, parser.fromJson(billJson, Person::class.java))
    }
}