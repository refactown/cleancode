package refactown.cleancode.megasena;

import java.util.List;

/**
 * Versão com maior testabilidade por receber os números sorteados.
 * O sorteio randômico impede o teste de unidade.
 */
public class MegaSenaV5 {

    /**
     * Método que calcula o valor que uma certa aposta deve receber em função do número de acertos.
     *
     * @param apostados Os números jogados em uma aposta.
     * @param sorteados Os números previamente sorteados
     * @param premioTotal O valor to prêmio em relação ao número de acertos.
     * @return O valor do prêmio a ser recebido por esta aposta.
     * @throws IllegalArgumentException se a aposta for inválida
     */
    public double calculaPremio(List<Integer> apostados, List<Integer> sorteados, double premioTotal) {
        if (!isApostaValida(apostados)) {
            throw new IllegalArgumentException("Aposta inválida:" + apostados);
        }
        long acertos = calculaAcertos(apostados, sorteados);
        if (acertos == 6) {
            return premioTotal; // Sena = 100%
        } else if (acertos == 5) {
            return premioTotal * 0.2; // Quina = 20%
        } else if (acertos == 4) {
            return premioTotal * 0.05; // Quadra = 5%
        }
        return 0.0;
    }

    private boolean isApostaValida(List<Integer> numerosApostados) {
        return numerosApostados.size() >= 6 && numerosApostados.size() <= 15 &&
                numerosApostados.stream().distinct().filter(n -> n >= 1 && n <= 60).
                        count() == numerosApostados.size();
    }

    private int calculaAcertos(List<Integer> apostados, List<Integer> sorteados) {
        return (int) apostados.stream().filter(n -> sorteados.contains(n)).count();
    }
}
