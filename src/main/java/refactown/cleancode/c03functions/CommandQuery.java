package refactown.cleancode.c03functions;

public class CommandQuery {

	public static boolean sett(String attribute, String value) {
		return true;
	}

	public static boolean attributeExists(String attribute) {
		return true;
	}
	
	public static void setAttribute(String attribute, String value) {
		
	}

	public static void main(String[] args) {
		if (sett("username", "bill")) {}

	    if (attributeExists("username")){
	        setAttribute("username", "bill");
	    }
	}
}
