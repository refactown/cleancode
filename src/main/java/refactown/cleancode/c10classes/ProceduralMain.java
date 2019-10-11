package refactown.cleancode.c10classes;

import java.util.ArrayList;
import java.util.List;

import refactown.cleancode.c03functions.PedraPapelTesoura;
import refactown.cleancode.c10classes.enums.Mao;
import refactown.cleancode.c10classes.enums.Resultado;
import refactown.cleancode.c10classes.enums.ResultadoJogada;

public class ProceduralMain {

	public static void main(String[] args) {
		int rodadas = 5;
		int scoreBill = 0;
		int scoreBob = 0;
		List<ResultadoJogada> resultados = new ArrayList<ResultadoJogada>();
		Resultado resultadoDoprimeiro ;
		ResultadoJogada resultadoJogada ;
		char charBill;
		char charBob;
		for (int i=0; i < rodadas; i++) {
			charBill = Mao.aleatoria().getId();
			charBob = Mao.aleatoria().getId();
			resultadoDoprimeiro = Resultado.of(PedraPapelTesoura.pedraPapelTesoura(charBill, charBob));
			resultadoJogada = ResultadoJogada.of(resultadoDoprimeiro);
			if (ResultadoJogada.PRIMEIRO_VENCE.equals(resultadoJogada)) {
				scoreBill++;
			} else if (ResultadoJogada.SEGUNDO_VENCE.equals(resultadoJogada)) {
				scoreBob++;
			} // empate não faz nada
			resultados.add(resultadoJogada);
		}
		// Print
		if (scoreBill > scoreBob) {
			System.out.println("Vencedor: Bill (Primeiro)");
		} else if (scoreBob > scoreBill) {
			System.out.println("Vencedor: Bob (Segundo)");
		} else {
			System.out.println("Empate");
		}
		System.out.println("Resultados:" + resultados);
	}
}
