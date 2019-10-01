package refactown.cleancode.c03functions;

import static org.junit.jupiter.api.Assertions.*;
import static refactown.cleancode.c03functions.RockPaperScissors.rockPaperScissors;

import org.junit.jupiter.api.Test;

class RockPaperScissorsTest {

	@Test
	void testRockPaperScissors() {
		// DRAW = 0
		assertEquals(0, rockPaperScissors('R', 'R'));
		assertEquals(0, rockPaperScissors('P', 'P'));
		assertEquals(0, rockPaperScissors('S', 'S'));
		// Fisrt Wins = -1
		assertEquals(-1, rockPaperScissors('R', 'S'));
		assertEquals(-1, rockPaperScissors('S', 'P'));
		assertEquals(-1, rockPaperScissors('P', 'R'));
		// Second Wins = 1
		assertEquals(1, rockPaperScissors('S', 'R'));
		assertEquals(1, rockPaperScissors('P', 'S'));
		assertEquals(1, rockPaperScissors('R', 'P'));
		// Illegal Argument
		try {
			rockPaperScissors('A', 'R');
		} catch (IllegalArgumentException e) {
		}
		try {
			rockPaperScissors('S', '*');
		} catch (IllegalArgumentException e) {
		}
		try {
			rockPaperScissors(' ', '%');
		} catch (IllegalArgumentException e) {
		}
	}
}
