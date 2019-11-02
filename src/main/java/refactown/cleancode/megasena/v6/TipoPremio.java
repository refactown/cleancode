package refactown.cleancode.megasena.v6;

import java.util.Optional;

/**
 * Enum com os três tipos possíveis de prêmio: Sena, Quina e Quadra
 */
public enum TipoPremio {

    SENA(6, 100.0, 62.0),
    QUINA(5, 20.0, 19.0),
    QUADRA(4, 5.0, 19.0);

    private final int acertos;
    private final double percentual; // regra inventada para o exercício
    private final double rateio; // regra da Mega Sena real

    TipoPremio(int acertos, double percentual, double rateio) {
        this.acertos = acertos;
        this.percentual = percentual;
        this.rateio = rateio;
    }

    public static Optional<TipoPremio> of(int acertos){
        for (TipoPremio tipoPremio: values()){
            if (tipoPremio.acertos==acertos){
                return Optional.of(tipoPremio);
            }
        }
        return Optional.empty();
    }

    public double calculaValor(double premioTotal){
        return premioTotal * (percentual / 100);
    }

    public int getAcertos() {
        return acertos;
    }

    public double getPercentual() {
        return percentual;
    }

    public double getRateio() {
        return rateio;
    }
}
