package refactown.cleancode.c10classes.model;

import refactown.cleancode.c03functions.PedraTesouraPapel;
import refactown.cleancode.c10classes.enums.Mao;
import refactown.cleancode.c10classes.enums.Resultado;
import refactown.cleancode.c10classes.enums.ResultadoJogada;

public class JogadaAcoplada implements Jogada {
	private final Jogador primeiroJogador;
	private final Jogador segundoJogador;
	public JogadaAcoplada(Jogador primeiroJogador, Jogador segundoJogador) {
		super();
		this.primeiroJogador = primeiroJogador;
		this.segundoJogador = segundoJogador;
	}

	@Override
	public ResultadoJogada jogar() {
		Mao primeira = primeiroJogador.jogar();
		Mao segunda = segundoJogador.jogar();
		int resultInt = PedraTesouraPapel.pedraTesouraPapel(primeira.getId(), segunda.getId());
		Resultado resultadoDoPrimeiro = Resultado.of(resultInt);
		return ResultadoJogada.of(resultadoDoPrimeiro);
	}

	public Jogador getPrimeiroJogador() {
		return primeiroJogador;
	}

	public Jogador getSegundoJogador() {
		return segundoJogador;
	}
}
