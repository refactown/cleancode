package refactown.cleancode.megasena.modelo;

import java.util.Objects;

/**
 * Representa um apostador que fez uma aposta. Uma aposta pode ter vários apostadores (bolão).
 */
public class Apostador {

    private final Cpf cpf;

    public Apostador(Cpf cpf) {
        if (cpf == null){
            throw new NullPointerException("O CPF do apostador não pode ser nulo!");
        }
        this.cpf = cpf;
    }

    public Cpf getCpf() {
        return cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apostador apostador = (Apostador) o;
        return Objects.equals(cpf, apostador.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return cpf.toString();
    }
}
