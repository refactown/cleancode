package tdc2020poa;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * PTP = Pedra, Tesoura e Papel
 * Classe que contém a regra de negócio do jogo "Pedra, Tesoura e Papel"
 */
public class PTP {
    public static final char PEDRA = 'R'; // ROCK
    public static final char TESOURA = 'S'; // SCISSORS
    public static final char PAPEL = 'P'; // PAPER
    private static final List VALIDAS = asList(PEDRA, TESOURA, PAPEL);
    public static final short PRIMEIRO_VENCE = -1;
    public static final short EMPATE = 0;
    public static final short SEGUNDO_VENCE = 1;

    // EMPATE = 0            -1             1
    public int jogar(char primeira, char segunda) { // Ciclomática=11 Cognitiva=17
        if (!VALIDAS.contains(primeira)) {
            throw new IllegalArgumentException("Primeira letra inválida:" + primeira + ". Válidas=" + VALIDAS);
        }
        if (!VALIDAS.contains(segunda)) {
            throw new IllegalArgumentException("Segunda letra inválida:" + segunda + ". Válidas=" + VALIDAS);
        }
        if (primeira == PEDRA) {
            if (segunda == PAPEL) return SEGUNDO_VENCE;
            else if (segunda == TESOURA) return PRIMEIRO_VENCE;
            else return EMPATE;
        } else if (primeira == PAPEL) {
            if (segunda == TESOURA) return SEGUNDO_VENCE;
            else if (segunda == PEDRA) return PRIMEIRO_VENCE;
            else return EMPATE;
        } else { // TESOURA
            if (segunda == PEDRA) return SEGUNDO_VENCE;
            else if (segunda == PAPEL) return PRIMEIRO_VENCE;
            else return EMPATE;
        }
    }

    public int jogar(Rodada rodada){ // Ciclomática=9 Cognitiva=15
        if (rodada.getPrimeira() == PEDRA) {
            if (rodada.getSegunda() == PAPEL) return SEGUNDO_VENCE;
            else if (rodada.getSegunda() == TESOURA) return PRIMEIRO_VENCE;
            else return EMPATE;
        } else if (rodada.getPrimeira() == PAPEL) {
            if (rodada.getSegunda() == TESOURA) return SEGUNDO_VENCE;
            else if (rodada.getSegunda() == PEDRA) return PRIMEIRO_VENCE;
            else return EMPATE;
        } else { // TESOURA
            if (rodada.getSegunda() == PEDRA) return SEGUNDO_VENCE;
            else if (rodada.getSegunda() == PAPEL) return PRIMEIRO_VENCE;
            else return EMPATE;
        }
    }
}
