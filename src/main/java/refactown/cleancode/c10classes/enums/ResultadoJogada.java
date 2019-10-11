package refactown.cleancode.c10classes.enums;

import java.util.HashMap;
import java.util.Map;

public enum ResultadoJogada {
	
	PRIMEIRO_VENCE(Resultado.VENCE, Resultado.PERDE),
	EMPATE(Resultado.EMPATE, Resultado.EMPATE),
	SEGUNDO_VENCE(Resultado.PERDE, Resultado.VENCE);

	private final Resultado resultadoDoPrimeiro;
	private final Resultado resultadoDoSegundo;
	
	private static final Map<Resultado, ResultadoJogada> JOGADAS = new HashMap<Resultado, ResultadoJogada>();
	
	static {
		JOGADAS.put(Resultado.VENCE, ResultadoJogada.PRIMEIRO_VENCE);
		JOGADAS.put(Resultado.EMPATE, ResultadoJogada.EMPATE);
		JOGADAS.put(Resultado.PERDE, ResultadoJogada.SEGUNDO_VENCE);
	}
	
	ResultadoJogada(Resultado resultadoDoPrimeiro, Resultado resultadoDoSegundo) {
		this.resultadoDoPrimeiro = resultadoDoPrimeiro;
		this.resultadoDoSegundo = resultadoDoSegundo;
	}
	
	public static ResultadoJogada of(Resultado resultadoDoPrimeiro) {
		return JOGADAS.get(resultadoDoPrimeiro);
	}
}
