package refactown.cleancode.c08boundary.java;

public interface JsonParser {

	public Object fromJson(String json, Class<?> clazz);
	
	public String toJson(Object obj);
}
