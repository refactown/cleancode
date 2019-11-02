package refactown.cleancode.megasena.modelo;

import java.util.Objects;

/**
 * Representa um número no Cadastro Nacional de Pessoa Física (CPF).
 * É usado para identificar o apostador.
 */
public class Cpf {

    private final String numero;

    public Cpf(String numero) {
        Objects.requireNonNull(numero, "O número não pode ser nulo");
        String semTracoOuPontos = semTracoOuPontos(numero);
        String somenteNumeros = somenteNumeros(semTracoOuPontos);
        if (!semTracoOuPontos.equals(somenteNumeros)) {
            throw new IllegalArgumentException("CPF com caracteres inválidos:" + numero);
        }
        if (!isValido(somenteNumeros)) {
            throw new IllegalArgumentException("CPF de tamanho inválido:" + numero);
        }
        this.numero = somenteNumeros;
    }

    private String semTracoOuPontos(String numeroNaoTratado) {
        return numeroNaoTratado.replaceAll("\\.", "").replaceAll("-", "");
    }

    private String somenteNumeros(String numeroNaoTratado) {
        return numeroNaoTratado.chars().filter(c -> Character.isDigit(c))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    private boolean isValido(String numero) {
        return numero.length() == 11; // TODO validar DV
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj instanceof Cpf) {
            Cpf other = (Cpf) obj;
            return numero.equals(other.numero);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return numero.hashCode();
    }

    @Override
    public String toString() {
        return numero;
    }

    public String getNumero() {
        return numero;
    }
}
