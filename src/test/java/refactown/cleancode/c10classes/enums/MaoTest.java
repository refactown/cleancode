package refactown.cleancode.c10classes.enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaoTest {

	@Test
	void test() {
		assertTrue(Mao.PEDRA.vence(Mao.TESOURA));
		assertTrue(Mao.TESOURA.vence(Mao.PAPEL));
		assertTrue(Mao.PAPEL.vence(Mao.PEDRA));
	}

}
