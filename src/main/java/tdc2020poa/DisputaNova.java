package tdc2020poa;

/** Disputa que refaz a regra de negócio e abandona "PTP". */
public class DisputaNova extends Disputa{

    public DisputaNova(Jogador primeiroJogador, Jogador segundoJogador) {
        super(primeiroJogador, segundoJogador);
    }

    @Override  public Resultado jogar() {
        Mao primeira = getPrimeiroJogador().jogar();
        Mao segunda = getSegundoJogador().jogar();
        if (primeira.vence(segunda)){
            return Resultado.PRIMEIRO_VENCE;
        } else if (segunda.vence(primeira)){
            return Resultado.SEGUNDO_VENCE;
        }
        return Resultado.EMPATE;
    }
}
