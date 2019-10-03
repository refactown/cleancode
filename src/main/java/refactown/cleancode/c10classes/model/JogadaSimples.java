package refactown.cleancode.c10classes.model;

import refactown.cleancode.c10classes.enums.Mao;
import refactown.cleancode.c10classes.enums.ResultadoJogada;

public class JogadaSimples implements Jogada{
	private final Jogador primeiroJogador;
	private final Jogador segundoJogador;
	public JogadaSimples(Jogador primeiroJogador, Jogador segundoJogador) {
		super();
		this.primeiroJogador = primeiroJogador;
		this.segundoJogador = segundoJogador;
	}

	@Override
	public ResultadoJogada jogar() {
		Mao primeiraMao = primeiroJogador.jogar();
		Mao segundaMao = segundoJogador.jogar();
		if (primeiraMao.vence(segundaMao)) {
			return ResultadoJogada.PRIMEIRO_VENCE;
		} 
		if (segundaMao.vence(primeiraMao)) {
			return ResultadoJogada.SEGUNDO_VENCE;
		}
		return ResultadoJogada.EMPATE;
	}

	public Jogador getPrimeiroJogador() {
		return primeiroJogador;
	}

	public Jogador getSegundoJogador() {
		return segundoJogador;
	}

}
