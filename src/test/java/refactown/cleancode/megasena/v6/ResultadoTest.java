package refactown.cleancode.megasena.v6;

import org.junit.jupiter.api.Test;
import refactown.cleancode.megasena.v6.Resultado;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ResultadoTest {


    @Test
    void deveRetornarSeisNumerosNaOrdem0() {
        Resultado resultado = new Resultado(Arrays.asList(5, 13, 27, 34, 41, 52));
        assertEquals(Arrays.asList(5, 13, 27, 34, 41, 52), resultado.getNumeros());
        assertTrue(resultado.foiSorteado(5));
        assertTrue(resultado.foiSorteado(13));
        assertTrue(resultado.foiSorteado(27));
        assertTrue(resultado.foiSorteado(34));
        assertTrue(resultado.foiSorteado(41));
        assertTrue(resultado.foiSorteado(52));

        assertFalse(resultado.foiSorteado(59));
    }

}