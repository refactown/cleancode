package refactown.cleancode.c07exceptions;

import static org.junit.jupiter.api.Assertions.*;
import static refactown.cleancode.c07exceptions.java.JsonParsing.fromJsonV0;
import static refactown.cleancode.c07exceptions.java.JsonParsing.fromJsonV1;
import static refactown.cleancode.c07exceptions.java.JsonParsing.fromJsonV2;

import org.junit.jupiter.api.Test;

import com.google.gson.JsonSyntaxException;

import refactown.cleancode.c06objects.Person;
import refactown.cleancode.c07exceptions.java.JsonException;

class JsonParsingTest {

	@Test
	void testV0NullVersion() {
		// Parsing ok
		String billJson = "{name:\"Bill\", age:25, city:\"Rio de Janeiro\"}";
		Person billPerson = (Person) fromJsonV0(billJson, Person.class);
		assertEquals(billPerson.getName(), "Bill");
		assertEquals(billPerson.getAge(), 25);
		assertEquals(billPerson.getCity(), "Rio de Janeiro");
		// Error Parsing
		String joeJson = "{ age:25, city:\"Rio de Janeiro\""; // invalid
		Person joePerson = (Person) fromJsonV0(joeJson, Person.class);
		if (joePerson != null) { // forced by "return null"
			assertEquals(joePerson.getName(), null);
			assertEquals(joePerson.getAge(), 0);
			assertEquals(joePerson.getCity(), null);
		}
	}

	@Test
	void testV1() {
		// Parsing ok
		String billJson = "{name:\"Bill\", age:25, city:\"Rio de Janeiro\"}";
		Person billPerson = (Person) fromJsonV1(billJson, Person.class);
		assertEquals(billPerson.getName(), "Bill");
		assertEquals(billPerson.getAge(), 25);
		assertEquals(billPerson.getCity(), "Rio de Janeiro");
		// Error Parsing
		String joeJson = "{ age:25, city:\"Rio de Janeiro\""; // invalid
		try {
			Person joePerson = (Person) fromJsonV1(joeJson, Person.class);
			fail(); // must throw JavaJsonException
		} catch (JsonException jjpe) {
			
		}
	}

	@Test
	void testV2() {
		// Parsing ok
		String billJson = "{name:\"Bill\", age:25, city:\"Rio de Janeiro\"}";
		Person billPerson = (Person) fromJsonV2(billJson, Person.class);
		assertEquals(billPerson.getName(), "Bill");
		assertEquals(billPerson.getAge(), 25);
		assertEquals(billPerson.getCity(), "Rio de Janeiro");
		// Error Parsing
		String joeJson = "{ age:25, city:\"Rio de Janeiro\""; // invalid
		try {
			Person joePerson = (Person) fromJsonV2(joeJson, Person.class);
			fail(); // must throw JavaJsonException
		} catch (JsonException jjpe) {
			assertEquals(JsonSyntaxException.class, jjpe.getCause().getClass());
		}
	}

}
