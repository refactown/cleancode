package refactown.cleancode.megasena;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Classe que calcula o prêmio da Megasena a partir de um valor total e
 * dos números apostados e os sorteados.
 * Classe para o exercício de refatoração de um método muito grande e complexo.
 * <p>
 * Versão Inicial {@link MegaSenaV1}
 * Versão Final {@link MegaSenaV5}
 */
public class CalculadoraPremio {

    public static final int ACERTOS_SENA = 6;
    public static final int ACERTOS_QUINA = 5;
    public static final int ACERTOS_QUADRA = 4;
    public static final double PREMIO_QUINA = 0.2;
    public static final double PREMIO_QUADRA = 0.05;

    public double calcula(Aposta aposta, List<Integer> numerosSorteados,
                          double premioTotal) {
        int acertos = contaAcertos(aposta.getNumeros(), numerosSorteados);

        if (acertos == ACERTOS_SENA) {
            return premioTotal; // Sena = 100%
        } else if (acertos == ACERTOS_QUINA) {
            return premioTotal * PREMIO_QUINA; // Quina = 20%
        } else if (acertos == ACERTOS_QUADRA) {
            return premioTotal * PREMIO_QUADRA; // Quadra = 5%
        }

        return 0.0;
    }

    private int contaAcertos(List<Integer> numerosApostados, List<Integer> numerosSorteados) {
        int acertos = 0;
        for (Integer apostado : numerosApostados) {
            if (numerosSorteados.contains(apostado)) {
                acertos++;
            }
        }
        return acertos;
    }

}
