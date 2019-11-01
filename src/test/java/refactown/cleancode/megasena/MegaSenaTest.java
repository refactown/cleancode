package refactown.cleancode.megasena;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Arrays;
import java.util.List;

class MegaSenaTest {

    @Test
    void calculaPremioV1() {
        MegaSenaV1 megaSena = new MegaSenaV1();
        double premio = megaSena.calculaPremio(Arrays.asList(12, 34, 55, 23, 14, 44), 2000.0);
        assertTrue(premio >=0.0);
    }

    @Test
    void deveLancarExcecaoPorApostaInvalida() {
        MegaSenaV4 megaSena = new MegaSenaV4();
        assertThrows(IllegalArgumentException.class, () -> {
            megaSena.calculaPremio(Arrays.asList(23, 14, 44), 2000.0);
        });
    }

    @Test
    void devePagarPremioTotalV5() {
        List<Integer> apostados = Arrays.asList(05, 12, 25, 32, 44, 51);
        List<Integer> sorteados = Arrays.asList(05, 12, 25, 32, 44, 51);
        double premio = 2000.0;
        MegaSenaV5 megaSena = new MegaSenaV5();
        assertEquals(premio, megaSena.calculaPremio(apostados, sorteados, premio));
    }

    @Test
    void devePagarQuinaV5() {
        List<Integer> apostados = Arrays.asList(05, 12, 25, 32, 44, 51);
        List<Integer> sorteados = Arrays.asList(05, 12, 25, 32, 44, 59);
        double premio = 2000.0;
        MegaSenaV5 megaSena = new MegaSenaV5();
        assertEquals(premio * 0.2, megaSena.calculaPremio(apostados, sorteados, premio));
    }

    @Test
    void devePagarQuadraV5() {
        List<Integer> apostados = Arrays.asList(05, 12, 25, 32, 44, 51);
        List<Integer> sorteados = Arrays.asList(05, 12, 25, 32, 49, 59);
        double premio = 2000.0;
        MegaSenaV5 megaSena = new MegaSenaV5();
        assertEquals(premio * 0.05, megaSena.calculaPremio(apostados, sorteados, premio));
    }

    @Test
    void devePagarNadaV5() {
        List<Integer> apostados = Arrays.asList(05, 12, 25, 32, 44, 51);
        List<Integer> sorteados = Arrays.asList(05, 12, 25, 39, 49, 59);
        double premio = 2000.0;
        MegaSenaV5 megaSena = new MegaSenaV5();
        assertEquals(0.0, megaSena.calculaPremio(apostados, sorteados, premio));
    }

}
