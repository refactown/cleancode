package refactown.cleancode.c10classes.model;

import refactown.cleancode.c10classes.enums.ResultadoJogada;

public interface Jogada {

	ResultadoJogada jogar();

	public Jogador getPrimeiroJogador();

	public Jogador getSegundoJogador();

}