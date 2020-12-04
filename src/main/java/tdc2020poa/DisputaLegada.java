package tdc2020poa;

/** Disputa que usa o código legado "PTP". */
public class DisputaLegada extends Disputa{

    public DisputaLegada(Jogador primeiroJogador, Jogador segundoJogador) {
        super(primeiroJogador, segundoJogador);
    }

    @Override public Resultado jogar() {
        Mao primeira = getPrimeiroJogador().jogar();
        Mao segunda = getSegundoJogador().jogar();
        PTP ptp = new PTP();
        int resultadoInt = ptp.jogar(primeira.getId(), segunda.getId());
        return Resultado.of(resultadoInt);
    }
}
