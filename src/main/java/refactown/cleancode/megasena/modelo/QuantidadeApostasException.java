package refactown.cleancode.megasena.modelo;

/**
 * Exceção gerada quando há a tentativa de registrar um bilhete ou bolão com a quantidade inválida de apostas.
 * Nestes casoso sistema deve recomendar que o usuário remova alguma (se excedeu).
 */
public class QuantidadeApostasException extends RuntimeException {

    private final int maximo;
    private final int jogado;

    public QuantidadeApostasException(int maximo, int jogado) {
        super("A quantidade máxima de apostas é" + maximo + ", mas foram jogadas " + jogado);
        this.maximo = maximo;
        this.jogado = jogado;
    }
}
