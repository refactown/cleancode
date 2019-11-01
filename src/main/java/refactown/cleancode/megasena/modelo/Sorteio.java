package refactown.cleancode.megasena.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Classe que representa um resultado de um sorteio que pode ser informado no construtor ou gerado randomicamente.
 */
public class Sorteio {

    private final List<Integer> numeros;

    public Sorteio(){
        this.numeros = Collections.unmodifiableList(sorteiaSeisNumeros());
    }

    public Sorteio(List<Integer> numeros) {
        this.numeros = Collections.unmodifiableList(numeros); // cópia defensiva
    }

    private List<Integer> sorteiaSeisNumeros() {
        List<Integer> numerosSorteados = new ArrayList<>();
        int numeroSorteado;
        while (numerosSorteados.size() < 6) {
            numeroSorteado = new Random().nextInt(59) + 1;
            if (!numerosSorteados.contains(numeroSorteado)) {
                numerosSorteados.add(numeroSorteado);
            }
        }
        return numerosSorteados;
    }

    public List<Integer> getNumeros() {
        return numeros;
    }
}
