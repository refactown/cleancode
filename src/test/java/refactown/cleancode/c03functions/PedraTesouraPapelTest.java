package refactown.cleancode.c03functions;

import static org.junit.jupiter.api.Assertions.*;
import static refactown.cleancode.c03functions.PedraTesouraPapel.pedraTesouraPapel;

import org.junit.jupiter.api.Test;

class PedraTesouraPapelTest {

	@Test
	void testPedraTesouraPapel() {
		// DRAW = 0
		assertEquals(0, pedraTesouraPapel('R', 'R'));
		assertEquals(0, pedraTesouraPapel('P', 'P'));
		assertEquals(0, pedraTesouraPapel('S', 'S'));
		// Fisrt Wins = -1
		assertEquals(-1, pedraTesouraPapel('R', 'S'));
		assertEquals(-1, pedraTesouraPapel('S', 'P'));
		assertEquals(-1, pedraTesouraPapel('P', 'R'));
		// Second Wins = 1
		assertEquals(1, pedraTesouraPapel('S', 'R'));
		assertEquals(1, pedraTesouraPapel('P', 'S'));
		assertEquals(1, pedraTesouraPapel('R', 'P'));
		// Illegal Argument
		try {
			pedraTesouraPapel('A', 'R');
		} catch (IllegalArgumentException e) {
		}
		try {
			pedraTesouraPapel('S', '*');
		} catch (IllegalArgumentException e) {
		}
		try {
			pedraTesouraPapel(' ', '%');
		} catch (IllegalArgumentException e) {
		}
	}
}
