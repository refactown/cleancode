package refactown.cleancode.c10classes.enums;

import java.util.HashMap;
import java.util.Map;

public enum Resultado {

	PERDE(-1),
	EMPATE(0),
	VENCE(1);
	
	private final int valor;
	
	private static final Map<Integer, Resultado> RESULTADOS = new HashMap<Integer, Resultado>();
	
	static {
		RESULTADOS.put(-1, PERDE);
		RESULTADOS.put(0, EMPATE);
		RESULTADOS.put(1,VENCE);
	}

	private Resultado(int valor) {
		this.valor = valor;
	}
	
	public static Resultado of(int valor) {
		return RESULTADOS.get(valor);
	}

	public int getValor() {
		return valor;
	}
}
