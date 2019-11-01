package refactown.cleancode.megasena.modelo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Representa uma aposta feita por um apostador. Ou seja, um conjunto de 6 a 15 números entre 1 e 60.
 * A aposta tem um estado imutável.
 */
public class Aposta {

    private final List<Integer> numeros;

    public Aposta(List<Integer> numeros){
        if (!isApostaValida(numeros)){
            throw new IllegalArgumentException("Aposta inválida:" + numeros);
        }
        this.numeros = Collections.unmodifiableList(numeros); // cópia defensiva
    }

    private boolean isApostaValida(List<Integer> numerosApostados) {
        return numerosApostados.size() >= 6 && numerosApostados.size() <= 15 &&
                numerosApostados.stream().distinct().filter(n -> n >= 1 && n <= 60).
                        count() == numerosApostados.size();
    }

    public int calculaAcertos(Sorteio sorteio){
        return (int) numeros.stream().filter(n -> sorteio.getNumeros().contains(n)).count();
    }

    public List<Integer> getNumeros() {
        return numeros;
    }
}
