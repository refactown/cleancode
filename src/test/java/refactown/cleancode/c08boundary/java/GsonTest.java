package refactown.cleancode.c08boundary.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.google.gson.Gson;

import refactown.cleancode.c06objects.Person;
import refactown.cleancode.c06objects.PersonJ;

public class GsonTest {

	@Test
	public void toJsonUsingGson() {
		Gson gson = new Gson();
		PersonJ billPerson = new PersonJ("Bill", 25, "Rio de Janeiro");
		String billJson = "{\"name\":\"Bill\",\"age\":25,\"city\":\"Rio de Janeiro\"}";
		Assertions.assertEquals(billJson, gson.toJson(billPerson));
	}

	@Test
	public void fromJsonUsingGson() {
		Gson gson = new Gson();
		PersonJ billPerson = new PersonJ("Bill", 25, "Rio de Janeiro");
		String billJson = "{\"name\":\"Bill\",\"age\":25,\"city\":\"Rio de Janeiro\"}";
		Assertions.assertEquals(billPerson, gson.fromJson(billJson, PersonJ.class));
	}
}
