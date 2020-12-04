package tdc2020poa;
/**
 * Representa uma disputa entre dois jogadores que
 * pode ocorrer inúmeras vezes. A disputa ocorre quando
 * é chamado seu método "jogar" e cada jogador informa sua mão.
 */
public abstract class Disputa {
    private final Jogador primeiroJogador;
    private final Jogador segundoJogador;

    public Disputa(Jogador primeiroJogador, Jogador segundoJogador) {
        super();
        this.primeiroJogador = primeiroJogador;
        this.segundoJogador = segundoJogador;
    }

    public abstract Resultado jogar();

    public Jogador getPrimeiroJogador() {
        return primeiroJogador;
    }
    public Jogador getSegundoJogador() {
        return segundoJogador;
    }
}
