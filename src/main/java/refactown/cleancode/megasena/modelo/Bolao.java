package refactown.cleancode.megasena.modelo;

import refactown.cleancode.megasena.v6.Aposta;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Bolao extends Bilhete{

    private final List<Apostador> participantes;

    public Bolao(String numero, Apostador volante, List<Aposta> apostas, List<Apostador> participantes) {
        super(numero, volante, apostas);
        Objects.requireNonNull(participantes, "Atributo 'participantes' não pode sr nulo");
        if (!apostadoresValidos(participantes)){
            throw new IllegalArgumentException("Participantes inválidos:");
        }
        this.participantes = Collections.unmodifiableList(participantes);
    }

    private boolean apostadoresValidos(List<Apostador> apostadores) {
        return true;
    }

    private boolean apostasComMesmoTamanho(Bilhete bilhete) {
        return true;
    }

    public List<Apostador> getParticipantes() {
        return participantes;
    }
}
