package refactown.cleancode.c10classes.model;

import java.util.ArrayList;
import java.util.List;

import refactown.cleancode.c10classes.enums.ResultadoJogada;

public class MelhorDeTres {

	private final Jogada jogada;
	private final int rodadas;

	private int scoreDoPrimeiro;
	private int scoreDoSegundo;
	private int scoreVencedor;
	private List<ResultadoJogada> resultados = new ArrayList<ResultadoJogada>();
	
	public MelhorDeTres(Jogada jogada) {
		this(jogada, 3);
	}

	public MelhorDeTres(Jogada jogada, int rodadas) {
		super();
		this.jogada = jogada;
		this.rodadas = rodadas;
		scoreVencedor = rodadas / 2 + 1;
	}
	
	public void jogar() {
		for (int i=0; i < rodadas; i++) {
			ResultadoJogada resultadoJogada = jogada.jogar();
			resultados.add(resultadoJogada);
			if (ResultadoJogada.PRIMEIRO_VENCE.equals(resultadoJogada)) {
				scoreDoPrimeiro++;
			} else if (ResultadoJogada.SEGUNDO_VENCE.equals(resultadoJogada)) {
				scoreDoSegundo ++;
			} 
			if (jaTemVencedor()) break;
		}
	}
	
	public boolean temVencedor() {
		return scoreDoPrimeiro != scoreDoSegundo;
	}
	
	public Jogador getVencedor() {
		if (scoreDoPrimeiro > scoreDoSegundo) {
			return jogada.getPrimeiroJogador();
		}
		if (scoreDoSegundo > scoreDoPrimeiro) {
			return jogada.getSegundoJogador();
		}
		throw new IllegalStateException("Não houve vencedor. Foi empate!");
	}

	private boolean jaTemVencedor() {
		return scoreDoPrimeiro >= scoreVencedor || scoreDoSegundo >= scoreVencedor;
	}

	public List<ResultadoJogada> getResultados() {
		return new ArrayList<ResultadoJogada>(resultados);
	}

	public int getScoreDoPrimeiro() {
		return scoreDoPrimeiro;
	}

	public int getScoreDoSegundo() {
		return scoreDoSegundo;
	}


}

