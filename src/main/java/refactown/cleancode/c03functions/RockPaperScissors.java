package refactown.cleancode.c03functions;

import java.util.Arrays;
import java.util.List;

public class RockPaperScissors {
	
	private static List<Character> VALID_CHOOSES =  Arrays.asList('R', 'S', 'P');

	public static int rockPaperScissors(char first, char second) {
	    if (!VALID_CHOOSES.contains(first)) {
	        throw new IllegalArgumentException("Invalid first choose:" + first + ". Use " + VALID_CHOOSES);
	    }
	    if (!VALID_CHOOSES.contains(second)) {
	        throw new IllegalArgumentException("Invalid second choose:" + second + ". Use " + VALID_CHOOSES);
	    }
	    if (first == 'R') {
	        if (second == 'P') return 1; else if (second == 'S') return -1; else return 0;
	    } else if (first == 'P') {
	        if (second == 'S') return 1; else if (second == 'R') return -1; else return 0;
	    } else { // S
	        if (second == 'R') return 1; else if (second == 'P') return -1; else return 0;
	    }
	
	}
}
