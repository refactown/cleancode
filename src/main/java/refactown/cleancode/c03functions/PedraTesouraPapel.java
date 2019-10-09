package refactown.cleancode.c03functions;

import java.util.Arrays;
import java.util.List;

public class PedraTesouraPapel {
	
	private static List<Character> VALID_CHOOSES =  Arrays.asList('R', 'S', 'P');

	public static int pedraTesouraPapel(char primeiro, char segundo) {
	    if (!VALID_CHOOSES.contains(primeiro)) {
	        throw new IllegalArgumentException("Primeira mão inválida:" + primeiro + ". Use " + VALID_CHOOSES);
	    }
	    if (!VALID_CHOOSES.contains(segundo)) {
	        throw new IllegalArgumentException("Segunda mão inválida:" + segundo + ". Use " + VALID_CHOOSES);
	    }
	    if (primeiro == 'R') {
	        if (segundo == 'P') return 1; else if (segundo == 'S') return -1; else return 0;
	    } else if (primeiro == 'P') {
	        if (segundo == 'S') return 1; else if (segundo == 'R') return -1; else return 0;
	    } else { // S
	        if (segundo == 'R') return 1; else if (segundo == 'P') return -1; else return 0;
	    }
	
	}
}
