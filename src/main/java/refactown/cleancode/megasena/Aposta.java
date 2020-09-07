package refactown.cleancode.megasena;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Aposta {

    private final List<Integer> numeros;

    public Aposta(List<Integer> numeros) {
        this.numeros = Collections.unmodifiableList(numeros);// cópia defensiva
        validarAposta(numeros);
    }

    public static Aposta of(Integer... numeros) {
        List<Integer> numerosApostados =Arrays.asList(numeros);
        return new Aposta(numerosApostados);
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    private List<Integer> validarAposta(List<Integer> numerosApostados) {
        if (numerosApostados.size() < 6) {
            throw new IllegalArgumentException("A aposta mínima é de 6 números");
        }
        if (numerosApostados.size() > 15) {
            throw new IllegalArgumentException("A aposta máxima é de 15 números");
        }

        List<Integer> numerosValidos = new ArrayList<>();
        for (Integer apostado : numerosApostados) {
            if (apostado < 1 || apostado > 60) {
                throw new IllegalArgumentException("Os números apostados devem estar entre 1 e 60"); // inválido
            }
            if (numerosValidos.contains(apostado)) {
                throw new IllegalArgumentException("Número duplicado:" + apostado);  // repetido
            }
            numerosValidos.add(apostado);
        }
        return numerosValidos;
    }

}
