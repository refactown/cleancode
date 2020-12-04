package tdc2020poa;

public class JogadorMock extends Jogador {
    private final Mao mao;
    public JogadorMock(String nome, Mao mao) {
        super(nome);
        this.mao = mao;
    }
    @Override public Mao jogar() {
        return mao;
    }
}