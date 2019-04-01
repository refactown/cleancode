package refactown.cleancode.c08boundary

import com.google.gson.Gson
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import refactown.cleancode.c06objects.Person

class GsonTest {

    @Test
    fun toJsonUsingGson() {
        val gson = Gson()
        val billPerson = Person("Bill", 25, "Rio de Janeiro")
        val billJson = "{\"name\":\"Bill\",\"age\":25,\"city\":\"Rio de Janeiro\"}"
        Assertions.assertEquals(billJson, gson.toJson(billPerson))
    }

    @Test
    fun fromJsonUsingGson() {
        val gson = Gson()
        val billPerson = Person("Bill", 25, "Rio de Janeiro")
        val billJson = "{\"name\":\"Bill\",\"age\":25,\"city\":\"Rio de Janeiro\"}"
        Assertions.assertEquals(billPerson, gson.fromJson(billJson, Person::class.java))
    }
}