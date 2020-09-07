package refactown.cleancode.c10classes.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import refactown.cleancode.c10classes.enums.Mao;
import refactown.cleancode.c10classes.enums.ResultadoJogada;

class JogadaTest {
	@Test void test() {
		Jogador bill = new JogadorMock("Bill (Primeiro)", Mao.PAPEL);
		Jogador bob = new JogadorMock("Bob (Segundo)", Mao.PEDRA);
		Jogada jogada = new JogadaSimples(bill, bob);
		assertEquals(ResultadoJogada.PRIMEIRO_VENCE, jogada.jogar());
	}
}

class JogadorMock extends Jogador{
	private final Mao mao;
	public JogadorMock(String nome, Mao mao) {
		super(nome);
		this.mao = mao;
	}
	@Override public Mao jogar() {
		return mao;
	}	
}

