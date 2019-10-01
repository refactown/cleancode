package refactown.cleancode.c08boundary.java;

public class LogonController {
	
	private final JsonParser jsonParser;

	public LogonController(JsonParser jsonParser) {
		super();
		this.jsonParser = jsonParser;
	}

	public User logon(String login, String password) {
		String userJson = callHttp(login, password);
		return (User) jsonParser.fromJson(userJson, User.class);
	}
	
    private String callHttp(String login, String password) {
        return "{\"login\":\"admin\", \"role\":\"admin\"}"; //MOCK
    }

}
