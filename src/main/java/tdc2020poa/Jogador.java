package tdc2020poa;

/**
 * Representa um Jogador com seu nome
 * e sua capacidade e retornar a mão desejada.
 */
public class Jogador {
    private final String nome;
    public Jogador(String nome) {super(); this.nome = nome;}
    public Mao jogar() {
        return Mao.aleatoria();
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return "Jogador [nome=" + nome + "]";
    }
}
