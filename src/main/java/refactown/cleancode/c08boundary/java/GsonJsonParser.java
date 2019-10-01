package refactown.cleancode.c08boundary.java;

import com.google.gson.Gson;

import refactown.cleancode.c07exceptions.java.JsonException;

public class GsonJsonParser implements JsonParser {

	private Gson gson = new Gson();

	@Override
	public Object fromJson(String json, Class<?> clazz) {
		try {
			return gson.fromJson(json, clazz);
		} catch (RuntimeException e) {
			throw new JsonException("Parsing error. Json:" + json, e);
		}
	}

	@Override
	public String toJson(Object obj) {
		try {
			return gson.toJson(obj);
		} catch (RuntimeException e) {
			throw new JsonException("Serializing error. Object:" + obj, e);
		}

	}

}
