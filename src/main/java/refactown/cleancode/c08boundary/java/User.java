package refactown.cleancode.c08boundary.java;

public class User {

	private final String login;
	private final String role;
	public User(String login, String role) {
		super();
		this.login = login;
		this.role = role;
	}
	public String getLogin() {
		return login;
	}
	public String getRole() {
		return role;
	}
}
