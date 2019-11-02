package refactown.cleancode.megasena.v6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Classe que gera um resultado similado ao de um sorteio de 6 números.
 * Retorna uma instância pronta de <code>Resultado</code>.
 */
public class GloboGiratorio {

    public Resultado sorteiaSeisNumeros() {
        List<Integer> numerosSorteados = new ArrayList<>();
        int numeroSorteado;
        while (numerosSorteados.size() < 6) {
            numeroSorteado = new Random().nextInt(59) + 1;
            if (!numerosSorteados.contains(numeroSorteado)) {
                numerosSorteados.add(numeroSorteado);
            }
        }
        return new Resultado(numerosSorteados);
    }

}
