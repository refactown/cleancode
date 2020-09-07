package refactown.cleancode.c07exceptions.java;

import com.google.gson.Gson;

public class JsonParsing {

	public static Object fromJsonV0(String json, Class<?> clazz) {
		Gson gson = new Gson();
		try {
			return gson.fromJson(json, clazz);
		} catch (Exception e) {
			System.out.println("Parsing error. Json text:" + json);
			return null;
		}
	}

	public static Object fromJsonV1(String json, Class<?> clazz) {
		Gson gson = new Gson();
		try {
			return gson.fromJson(json, clazz);
		} catch (Exception e) {
			throw new JsonException("Parsing error. Json text:$json");
		}
	}

	public static Object fromJsonV2(String json, Class<?> clazz) {
		if (json == null){
			throw new NullPointerException("A variável json não pode ser nula!");
		}
		Gson gson = new Gson();
		try {
			return gson.fromJson(json, clazz);
		} catch (Exception e) {
			throw new JsonException("Parsing error. Json text:$json", e); // CAUSE
		}
	}

}
