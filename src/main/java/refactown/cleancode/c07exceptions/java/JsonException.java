package refactown.cleancode.c07exceptions.java;

public class JsonException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public JsonException(String message) {
		super(message);
	}

	public JsonException(String message, Throwable cause) {
		super(message, cause);
	}

}
