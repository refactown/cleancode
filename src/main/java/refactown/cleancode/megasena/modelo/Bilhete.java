package refactown.cleancode.megasena.modelo;

import refactown.cleancode.c10classes.Result;
import refactown.cleancode.megasena.v6.Aposta;
import refactown.cleancode.megasena.v6.Resultado;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * O Bilhete é a relação de um apostador principal (volante) com várias apostas.
 * Cada bilhete tem um número de identificação que o torna uma entidade.
 * Nesta "Mega Sena" a identificação do apostador volante (principal) é obrigatória).
 */
public class Bilhete {

    private final String numero; // identificadores são String mesmo sendo "número"

    private final Apostador volante; // volante = apostador principal que faz a aposta

    private final List<Aposta> apostas;

    public Bilhete(String numero, Apostador volante, List<Aposta> apostas) {
        Objects.requireNonNull(numero, "O número não pode ser nulo");
        Objects.requireNonNull(volante, "O apostador 'volante' não pode ser nulo");
        Objects.requireNonNull(apostas, "O atributo 'apostas' não pode ser nulo");
        if (numero.chars().filter(c-> !Character.isDigit(c)).count() > 0){
            throw new IllegalArgumentException("O número do bilhete deve ser composto somente por números");
        }
        if (apostas.size() > quantidadeMaximaApostas()){
            throw new QuantidadeApostasException(quantidadeMaximaApostas(), apostas.size());
        }
        this.numero = numero;
        this.volante = volante;
        this.apostas = apostas;
    }

    protected int quantidadeMaximaApostas(){
        return 3;
    }

    public String getNumero() {
        return numero;
    }

    public Apostador getVolante() {
        return volante;
    }

    public List<Aposta> getApostas() {
        return apostas;
    }

    public List<Aposta> getApostasByAcerto(int acertos, Resultado resultado) {
        return apostas.stream().filter(a-> a.calculaAcertos(resultado) == acertos).collect(Collectors.toList());
    }

}
