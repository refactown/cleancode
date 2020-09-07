package refactown.cleancode.c10classes;

import refactown.cleancode.c10classes.model.*;

public class ClassesMain {

	public static void main(String[] args) {
		Jogador bill = new Jogador("Bill (Primeiro)");
		Jogador bob = new Jogador("Bob (Segundo)");
		Jogada jogada = new JogadaSimples(bill, bob);
		MelhorDeTres melhorDeTres = new MelhorDeTres(jogada, 5);
		melhorDeTres.jogar();
		// Print
		if (melhorDeTres.temVencedor()) {
			System.out.println("Vencedor: " + melhorDeTres.getVencedor().getNome());
		} else {
			System.out.println("Empate");
		}
		System.out.println("Resultados:" + melhorDeTres.getResultados());
	}
}
