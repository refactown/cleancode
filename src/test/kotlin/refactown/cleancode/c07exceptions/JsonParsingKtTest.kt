package refactown.cleancode.c07exceptions

import com.google.gson.JsonSyntaxException
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import refactown.cleancode.c06objects.Person
import java.io.IOException

internal class JsonParsingKtTest {

    @Test
    fun testNullVersion(){
        // Parsing ok
        val billJson = "{name:\"Bill\", age:25, city:\"Rio de Janeiro\"}";
        val billPerson= fromJsonV0(billJson, Person::class.java) as Person?
        assertEquals(billPerson?.name, "Bill")
        assertEquals(billPerson?.age, 25)
        assertEquals(billPerson?.city, "Rio de Janeiro")
        // Error Parsing
        val joeJson = "{ age:25, city:\"Rio de Janeiro\""
        val joePerson = fromJsonV0(joeJson, Person::class.java) as Person?
        assertEquals(joePerson?.name, null)
        assertEquals(joePerson?.age, null)
        assertEquals(joePerson?.city, null)
    }

    @Test
    fun testV1(){
        // Parsing ok
        val billJson = "{name:\"Bill\", age:25, city:\"Rio de Janeiro\"}";
        val billPerson= fromJsonV1(billJson, Person::class.java) as Person
        assertEquals(billPerson.name, "Bill")
        assertEquals(billPerson.age, 25)
        assertEquals(billPerson.city, "Rio de Janeiro")
        // Error Parsing
        val joeJson = "{ age:25, city:\"Rio de Janeiro\""
        assertThrows(JsonException::class.java) {
            fromJsonV1(joeJson, Person::class.java) as Person
        }
    }

    @Test
    fun testV2(){
        // Parsing ok
        val billJson = "{name:\"Bill\", age:25, city:\"Rio de Janeiro\"}";
        val billPerson= fromJsonV2(billJson, Person::class.java) as Person
        assertEquals(billPerson.name, "Bill")
        assertEquals(billPerson.age, 25)
        assertEquals(billPerson.city, "Rio de Janeiro")
        // Error Parsing
        val joeJson = "{ age:25, city:\"Rio de Janeiro\""
        try {
            fromJsonV2(joeJson, Person::class.java) as Person
        } catch (e: JsonException) {
            assertEquals(JsonSyntaxException::class.java, e?.cause?.javaClass)
        }
    }


}