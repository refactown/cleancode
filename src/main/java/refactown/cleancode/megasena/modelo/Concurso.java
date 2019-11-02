package refactown.cleancode.megasena.modelo;

import refactown.cleancode.megasena.v6.Resultado;
import refactown.cleancode.megasena.v6.TipoPremio;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Representa o conjunto de bilhetes de um concurso bem como seu resultado.
 * É uma entidade identificda por seu número único.
 */
public class Concurso {

    private final String numero;
    private final List<Bilhete> bilhetes = new ArrayList<>();
    private Resultado resultado;


    public Concurso(String numero) {
        Objects.requireNonNull(numero, "O número não pode ser nulo");
        if (numero.chars().filter(c -> !Character.isDigit(c)).count() > 0) {
            throw new IllegalArgumentException("O número do concurso deve ser composto somente por números");
        }
        this.numero = numero;
    }

    /**
     * Informa se o concurso está aberto (aceitando novas apostas) ou encerrado (já tem resultado).
     *
     * @return <code>truu</code> se estiver encerrado ou <code>false</code> se não estiver.
     */
    public boolean isEncerrado() {
        return resultado != null;
    }

    public String getNumero() {
        return numero;
    }

    public void add(Bilhete bilhete) {
        if (isEncerrado()) {
            throw new IllegalStateException("O concurso já está encerrado a não aceita novas apostas");
        }
        if (bilhetes.contains(bilhete)) {
            throw new IllegalArgumentException("Bilhete já presente no concurso:" + bilhete);
        }
        bilhetes.add(bilhete);
    }

    public void addAll(Collection<Bilhete> novosBilhetes) {
        novosBilhetes.forEach(b -> add(b));
    }

    public List<Bilhete> getBilhetes() {
        return new ArrayList(bilhetes); // cópia defensiva
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    /**
     * Filtra os bilhetes premiados e retorna uma lista deles.
     *
     * @param tipoPremio O tipo de prêmio que se deseja filtrar: Sena, Quina ou Quadra.
     * @return Uma lista com os bilhetes premiados ou vazia se nenhum bilhete tiver sido premiado para o tipo selecionado.
     */
    public List<Bilhete> filtraPremiados(TipoPremio tipoPremio) {
        return filtraBilhetesPorAcerto(tipoPremio.getAcertos());
    }

    /**
     * Filtra os bilhetes com ao menos uma aposta com o número de acertos definida no parâmetro.
     *
     * @param acertos o número de acertos usado para filtrar os bilhetes.
     * @return Uma lista com os bilhetes premiados ou vazia se nenhum bilhete tiver sido premiado para o tipo selecionado.
     */
    public List<Bilhete> filtraBilhetesPorAcerto(int acertos) {
        return bilhetes.stream()
                .filter(b -> !b.getApostasByAcerto(acertos, resultado).isEmpty())
                .collect(Collectors.toList());
    }
}
