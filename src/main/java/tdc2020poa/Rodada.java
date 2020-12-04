package tdc2020poa;

import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

/**
 * Representa uma rodada de uma rodada de "Pedra, Tesoura e Papel". Cada rodada
 * é composta por duas "mãos" representadas por suas letras (R, S ou P).
 * Não é possível criar uma rodada sem que as duas opções estejam entre
 * estas trẽs letras. Dessa forma uma instância de <code>Rodada</code> sempre
 * tem um estado válido e imutável.
 * Se as mãos mudarem significa que é uma outra rodada e deve ser criada uma outra
 * instância desta classe.
 */
public class Rodada {
    private static final List VALIDAS = asList(PTP.PEDRA, PTP.TESOURA, PTP.PAPEL);

    private final char primeira;
    private final char segunda;

    public Rodada(char primeira, char segunda) {
        if (!VALIDAS.contains(primeira)) {
            throw new IllegalArgumentException("Primeira letra inválida:" + primeira + ". Válidas=" + VALIDAS);
        }
        if (!VALIDAS.contains(segunda)) {
            throw new IllegalArgumentException("Segunda letra inválida:" + segunda + ". Válidas=" + VALIDAS);
        }
        this.primeira = primeira;
        this.segunda = segunda;
    }

    public static Rodada of(char primeira, char segunda){
        return new Rodada(primeira, segunda);
    }

    public char getPrimeira() {
        return primeira;
    }

    public char getSegunda() {
        return segunda;
    }

    @Override
    public String toString() {
        return "Rodada{" +
                "primeira=" + primeira +
                ", segunda=" + segunda +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rodada rodada = (Rodada) o;
        return primeira == rodada.primeira &&
                segunda == rodada.segunda;
    }

    @Override
    public int hashCode() {
        return Objects.hash(primeira, segunda);
    }
}