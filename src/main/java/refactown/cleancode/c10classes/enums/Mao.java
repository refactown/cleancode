package refactown.cleancode.c10classes.enums;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public enum Mao {

	PEDRA('R'), // ROCK = R
	TESOURA('S'), // SCISSORS = S
	PAPEL('P');// PAPER = P
	
	private static final Map<Mao, Mao> VENCE = new HashMap<Mao, Mao>();
	
	static {
		VENCE.put(PAPEL, PEDRA);
		VENCE.put(TESOURA, PAPEL);
		VENCE.put(PEDRA, TESOURA);		
	}

	private final char id;

	Mao(char id) {
		this.id = id;
	}
	
	public static Mao aleatoria() {
		return values()[Math.abs(new Random().ints().findFirst().getAsInt() %3)];
	}
	public static Mao of(char letra){
		for (Mao mao: values()){
			if (mao.id == letra){
				return mao;
			}
		}
		throw new IllegalArgumentException("Letra inválida:"+letra);
	}

	public boolean vence(Mao outraMao) {
		return VENCE.get(this) == outraMao;
	}
	public char getId() {
		return id;
	}
}
