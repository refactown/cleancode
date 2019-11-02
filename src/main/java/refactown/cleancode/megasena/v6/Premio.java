package refactown.cleancode.megasena.v6;

import java.util.Optional;

/**
 * Prêmio a ser pago para os acertadores dependendo do número de acertos da aposta.
 * O cálculo do prêmio pago é feito em funçao da aposta e do resultado do sorteio.
 */
public class Premio { // equivalente a MegaSenaV6

    private final double valor;

    public Premio(double valor) {
        this.valor = valor;
    }

    public double calcula(Aposta aposta, Resultado resultado){
        int acertos = aposta.calculaAcertos(resultado);
        Optional<TipoPremio> tipoPremio = TipoPremio.of(acertos);
        return tipoPremio.isPresent()? tipoPremio.get().calculaValor(valor): 0.0;
    }

    public double getValor(){
        return valor;
    }
}
