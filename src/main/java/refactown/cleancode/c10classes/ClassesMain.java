package refactown.cleancode.c10classes;

import refactown.cleancode.c10classes.model.Jogada;
import refactown.cleancode.c10classes.model.JogadaAcoplada;
import refactown.cleancode.c10classes.model.Jogador;
import refactown.cleancode.c10classes.model.MelhorDeTres;

public class ClassesMain {

	public static void main(String[] args) {
		Jogador bill = new Jogador("Bill (Primeiro)");
		Jogador bob = new Jogador("Bob (Segundo)");
		Jogada jogada = new JogadaAcoplada(bill, bob);
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
