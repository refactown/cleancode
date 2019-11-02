package refactown.cleancode.megasena.v6;

import java.util.Collections;
import java.util.List;

/**
 * Classe que representa um resultado de um sorteio que pode ser informado no construtor ou gerado randomicamente.
 */
public class Resultado {

    private final List<Integer> numeros;

    public Resultado(List<Integer> numeros) {
        this.numeros = Collections.unmodifiableList(numeros); // cópia defensiva
    }

    public boolean foiSorteado(Integer numero) {
        return numeros.contains(numero);
    }

    public List<Integer> getNumeros() {
        return numeros;
    }
}
