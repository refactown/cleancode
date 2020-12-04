package tdc2020poa;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private final Disputa disputa;
    private final int rodadas;
    private int scoreDoPrimeiro;
    private int scoreDoSegundo;
    private int scoreVencedor;
    private List<Resultado> resultados = new ArrayList<Resultado>();

    public Jogo(Disputa disputa) {
        this(disputa, 3);
    }

    public Jogo(Disputa disputa, int rodadas) {
        super();
        this.disputa = disputa;
        this.rodadas = rodadas;
        scoreVencedor = rodadas / 2 + 1;
    }

    public void jogar() {
        for (int i=0; i < rodadas; i++) {
            Resultado resultado = disputa.jogar();
            resultados.add(resultado);
            if (Resultado.PRIMEIRO_VENCE.equals(resultado)) {
                scoreDoPrimeiro++;
            } else if (Resultado.SEGUNDO_VENCE.equals(resultado)) {
                scoreDoSegundo ++;
            }
            if (jaTemVencedor()) break;
        }
    }

    public boolean temVencedor() {
        return scoreDoPrimeiro != scoreDoSegundo;
    }

    public Jogador getVencedor() {
        if (scoreDoPrimeiro > scoreDoSegundo) {
            return disputa.getPrimeiroJogador();
        }
        if (scoreDoSegundo > scoreDoPrimeiro) {
            return disputa.getSegundoJogador();
        }
        throw new IllegalStateException("Não houve vencedor. Foi empate!");
    }

    private boolean jaTemVencedor() {
        return scoreDoPrimeiro >= scoreVencedor || scoreDoSegundo >= scoreVencedor;
    }

    public List<Resultado> getResultados() {
        return new ArrayList<Resultado>(resultados);
    }

    public int getScoreDoPrimeiro() {
        return scoreDoPrimeiro;
    }

    public int getScoreDoSegundo() {
        return scoreDoSegundo;
    }

}
