package refactown.cleancode.megasena.modelo;

import refactown.cleancode.megasena.v6.Aposta;

import java.util.ArrayList;
import java.util.List;

/**
 * Builder para construção de uma instância de <code>Bolao</code>.
 */
public class BolaoBuilder {

    private String numero;
    private Apostador volante;
    private List<Aposta> apostas = new ArrayList<>();
    private List<Apostador> participantes = new ArrayList<>();

    public BolaoBuilder numero(String numero){
        if (numero != null){
            throw new IllegalStateException("Atributo número já foi definido:" + numero);
        }
        if (numero.chars().filter(c-> !Character.isDigit(c)).count() > 0){
            throw new IllegalArgumentException("O número do bolão deve ser composto somente por números");
        }
        this.numero = numero;
        return this;
    }

    public BolaoBuilder apostadorVolante(Apostador volante){
        if (volante != null){
            throw new IllegalStateException("O apostador volante já foi definido");
        }
        this.volante = volante;
        participantes.add(volante);
        return this;
    }

    BolaoBuilder aposta(Aposta aposta){
        apostas.add(aposta);
        return this;
    }

    BolaoBuilder participante(Apostador participante){
        if (participantes.contains(participante)){
            throw new IllegalArgumentException("Participante '" + participante + "' já está na lista");
        }
        participantes.add(participante);
        return this;
    }

    public Bolao build(){
        return new Bolao(numero, volante, apostas, participantes);
    }

}
