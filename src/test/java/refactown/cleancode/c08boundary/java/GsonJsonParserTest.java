package refactown.cleancode.c08boundary.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import refactown.cleancode.c06objects.PersonJ;

class GsonJsonParserTest {

	@Test
    public void toJson() {
        GsonJsonParser parser = new GsonJsonParser();
        PersonJ billPerson = new PersonJ("Bill", 25, "Rio de Janeiro");
        String billJson = "{\"name\":\"Bill\",\"age\":25,\"city\":\"Rio de Janeiro\"}";
        assertEquals(billJson, parser.toJson(billPerson));
    }

    @Test
    public void fromJson() {
    	GsonJsonParser parser = new GsonJsonParser();
        PersonJ billPerson = new PersonJ("Bill", 25, "Rio de Janeiro");
        String billJson = "{\"name\":\"Bill\",\"age\":25,\"city\":\"Rio de Janeiro\"}";
        assertEquals(billPerson, parser.fromJson(billJson, PersonJ.class));
    }
}
