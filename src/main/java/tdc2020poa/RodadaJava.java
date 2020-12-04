package tdc2020poa;

import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

/** Versão Java da entidade Rodada */
public class RodadaJava {
    private static final List VALIDAS = asList(PTP.PEDRA, PTP.TESOURA, PTP.PAPEL);

    private final char primeira;
    private final char segunda;

    public RodadaJava(char primeira, char segunda) {
        if (!VALIDAS.contains(primeira)) {
            throw new IllegalArgumentException("Primeira letra inválida:" + primeira + ". Válidas=" + VALIDAS);
        }
        if (!VALIDAS.contains(segunda)) {
            throw new IllegalArgumentException("Segunda letra inválida:" + segunda + ". Válidas=" + VALIDAS);
        }
        this.primeira = primeira;
        this.segunda = segunda;
    }

    public static RodadaJava of(char primeira, char segunda){
        return new RodadaJava(primeira, segunda);
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
        RodadaJava rodada = (RodadaJava) o;
        return primeira == rodada.primeira &&
                segunda == rodada.segunda;
    }

    @Override
    public int hashCode() {
        return Objects.hash(primeira, segunda);
    }
}