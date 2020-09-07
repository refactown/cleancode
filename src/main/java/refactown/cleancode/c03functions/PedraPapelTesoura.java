package refactown.cleancode.c03functions;

import java.util.Arrays;
import java.util.List;

public class PedraPapelTesoura {
	


	public static int pedraPapelTesoura(char primeiro, char segundo) {
		List<Character> LETRAS_VALIDAS =  Arrays.asList('R', 'S', 'P');
	    if (!LETRAS_VALIDAS.contains(primeiro)) {
	        throw new IllegalArgumentException("Primeira mão inválida:" + primeiro + ". Use " + LETRAS_VALIDAS);
	    }
	    if (!LETRAS_VALIDAS.contains(segundo)) {
	        throw new IllegalArgumentException("Segunda mão inválida:" + segundo + ". Use " + LETRAS_VALIDAS);
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
