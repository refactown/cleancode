package refactown.cleancode.c03functions;

import static org.junit.jupiter.api.Assertions.*;
import static refactown.cleancode.c03functions.PedraPapelTesoura.pedraPapelTesoura;

import org.junit.jupiter.api.Test;

class PedraPapelTesouraTest {

	@Test
	void testPedraPapelTesoura() {
		// Empate = 0
		assertEquals(0, pedraPapelTesoura('R', 'R'));
		assertEquals(0, pedraPapelTesoura('P', 'P'));
		assertEquals(0, pedraPapelTesoura('S', 'S'));
		// Primeiro vence = -1
		assertEquals(-1, pedraPapelTesoura('R', 'S'));
		assertEquals(-1, pedraPapelTesoura('S', 'P'));
		assertEquals(-1, pedraPapelTesoura('P', 'R'));
		// Segundo vence = 1
		assertEquals(1, pedraPapelTesoura('S', 'R'));
		assertEquals(1, pedraPapelTesoura('P', 'S'));
		assertEquals(1, pedraPapelTesoura('R', 'P'));
		// Illegal Argument
		try {
			pedraPapelTesoura('A', 'R');
		} catch (IllegalArgumentException e) {
		}
		try {
			pedraPapelTesoura('S', '*');
		} catch (IllegalArgumentException e) {
		}
		try {
			pedraPapelTesoura(' ', '%');
		} catch (IllegalArgumentException e) {
		}
	}
}
