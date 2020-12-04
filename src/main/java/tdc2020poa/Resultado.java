package tdc2020poa;

import java.util.HashMap;
import java.util.Map;


public enum Resultado {
	PRIMEIRO_VENCE(-1),
	EMPATE(0),
	SEGUNDO_VENCE(1);
	
	private final int valor;
	
	private static final Map<Integer, Resultado> RESULTADOS
			= new HashMap<Integer, Resultado>();
	static {
		RESULTADOS.put(PRIMEIRO_VENCE.valor, PRIMEIRO_VENCE);
		RESULTADOS.put(EMPATE.valor, EMPATE);
		RESULTADOS.put(SEGUNDO_VENCE.valor, SEGUNDO_VENCE);
	}

	Resultado(int valor) {
		this.valor = valor;
	}
	
	public static Resultado of(int valor) {
		if (!RESULTADOS.containsKey(valor)){
			throw new IllegalArgumentException("Valor inválido para um resultado:"+ valor);
		}
		return RESULTADOS.get(valor);
	}
	public int getValor() {		return valor;	}
}
