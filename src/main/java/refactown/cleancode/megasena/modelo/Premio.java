package refactown.cleancode.megasena.modelo;

/**
 * Classe especializada em calcular o prêmio a partir de uma Aposta e de um Sorteio.
 */
public class Premio {

    private final double valor;

    public Premio(double valor) {
        this.valor = valor;
    }

    public double calcula(Aposta aposta, Sorteio sorteio){
        long acertos = aposta.calculaAcertos(sorteio);
        if (acertos == 6) {
            return valor; // 100%
        } else if (acertos == 5) {
            return valor * 0.2; // 20%
        } else if (acertos == 4) {
            return valor * 0.05; // 5%
        }
        return 0.0;

    }
}
