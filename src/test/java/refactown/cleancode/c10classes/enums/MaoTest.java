package refactown.cleancode.c10classes.enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaoTest {

	@Test
	void testRegraPrincipalPedraPapelTesoura() {
		assertTrue(Mao.PEDRA.vence(Mao.TESOURA));
		assertTrue(Mao.TESOURA.vence(Mao.PAPEL));
		assertTrue(Mao.PAPEL.vence(Mao.PEDRA));
	}

	@Test
	void testMaoOf() {
		assertEquals(Mao.PEDRA, Mao.of('R'));
		assertEquals(Mao.PAPEL, Mao.of('P'));
		assertEquals(Mao.TESOURA, Mao.of('S'));
		assertThrows(IllegalArgumentException.class, ()->{
			Mao.of('x');
		});
	}

}
