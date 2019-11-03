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

    @Override
    protected int quantidadeMaximaApostas() {
        return 10;
    }

    private boolean apostasComMesmoTamanho() {
        int tamanho = getApostas().get(0).getNumeros().size();
        return getApostas().stream()
                .filter(a-> a.getNumeros().size()!=tamanho).count()==0;
    }

    public List<Apostador> getParticipantes() {
        return participantes;
    }
}
