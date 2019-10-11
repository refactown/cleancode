package refactown.cleancode.c08boundary.java;

public interface JsonParser {

	Object fromJson(String json, Class<?> clazz);
	
	String toJson(Object obj);
}
